import requests
from lxml import html

for page in range(1,2) :
    url = requests.get('http://codeforces.com/submissions/joker_22/page/'+str(page))
    tree = html.fromstring(url.content)
    verdict = tree.xpath('//*[@id="pageContent"]/div[4]/div[6]/table/tr[position() > 1]/td[6]/span/span/text()')
    contestID = tree.xpath('//*[@id="pageContent"]/div[4]/div[6]/table/tr[position() > 1]/td[4]/a/text()')
    problemID = tree.xpath('//*[@id="pageContent"]/div[4]/div[6]/table/tr[position() > 1]/td[1]/a/text()')
    hashmap = {}
    for i in range(len(contestID)):
        r = list(map(str, contestID[i].split('             ')))
        contestID[i] =r[1][3:6]
        question = r[1][6:7]

    for i in range(len(verdict)):
        # change verdict or dont specify at all
        if verdict[i] == 'Accepted':
            solutionPage = requests.get(
                'http://codeforces.com/contest/' + str(contestID[i]) + '/submission/' + str(problemID[i]))
            tree2 = html.fromstring(solutionPage.text)
            code = str((tree2.xpath('//*[@id="pageContent"]/div[3]/pre/text()')))
            code = code.replace("\\t"," ")
            code = code.replace("['","")
            code = code.replace("']","")
            lines = code.split("\\r\\n")
            name  = str(contestID[i]) + str(question)
            value = hashmap.get(name,-1)
            #  print(value)
            if value == -1:
                hashmap[name] = 0
            else :
                value += 1
                hashmap[name] = value
                name = str(name) + "(" + str(value) + ")"
            name = str(name) + ".txt"
            print(name)
            fw = open(name,'w')
            for line in lines :
                fw.write(line+"\n")
            fw.close()




