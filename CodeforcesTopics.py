import requests
from lxml import html
from bs4 import BeautifulSoup

problems = {}
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
            name  = str(contestID[i]) + str(question)
            problems[name] = name
for page in problems :
    cname = page[0:3]
    cc = page[3:4]
    url = requests.get("http://codeforces.com/contest/"+str(cname)+"/problem/" + str(cc))
    soup2 = BeautifulSoup(url.text,"lxml")
    list = []
    for link in soup2.findAll('span',{'class' : 'tag-box'}) :
        title = link.string
        list.append(title)
    lines = str(list)
    list = lines.replace("\\r\\n","")
    list = list.split("'")
    list = str(list).split(",")
    st = ""
    for i in list:
        if i==' ':
            continue
        else:
          st = st + str(i)
    st = st.replace("[","")
    st = st.replace("]","")
    st = st.replace("'","")
    st = st.replace("     ","")
    print(page)
    print(st)












