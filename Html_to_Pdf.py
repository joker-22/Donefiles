import pdfcrowd
import requests
from bs4 import BeautifulSoup
from lxml import html
from urllib.request import urlopen

#url = requests.get("http://practice.geeksforgeeks.org/user-profile.php?user=joker_22")
#soup = BeautifulSoup(url.text,"lxml")
#for link in soup.findAll('a'):
 #   href = str(link.get('href'))
  #  if "problem-page" in href:
   #     print(link.string)


url = requests.get("http://practice.geeksforgeeks.org/company/Amazon/All/")
soup = BeautifulSoup(url.text,"lxml")
count = 0
url2 = "http://practice.geeksforgeeks.org"
for link in soup.findAll('a') :
    href = str(link.get('href'))
    if "problems" in href:
        url3 = requests.get(url2+href)
        tree = html.fromstring(url3.content)
        name = str(tree.xpath('//*[@id="border"]/div[1]/div/strong/text()'))
        name = name.replace("['","")
        name = name.replace("']","")
        print(name)
        pg = urlopen(url2+href).read()
        page = str(pg)
       # print(type(page))
        page = page.replace("\\r\\n","")
        page = page.replace("\\n","")
        page = page.replace("\\t","")
        html_name = str(name)+".html"
        file = open(html_name,"w")
        file.write(page)
        file.close()
        location = "file://C://Users//KARTHIK//PycharmProjects//FirstOne//"+name+".html"
        client = pdfcrowd.Client("joker_22", "85faba5c2beced665233993c6538e487")
        # convert an HTML file
        output_file = open(name+'.pdf', 'wb')
        client.convertFile('C://Users//KARTHIK//PycharmProjects//FirstOne//'+name+'.html', output_file)
        output_file.close()

        count += 1
print(count)

