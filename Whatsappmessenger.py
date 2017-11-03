
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time

# Replace below path with the absolute path
# to chromedriver in your computer
driver = webdriver.Chrome("C://Python36//Scripts//chromedriver")
driver.get("https://web.whatsapp.com/")
wait = WebDriverWait(driver, 600)

# Replace 'Friend's Name' with the name of your friend
# or the name of a group
target = "kalyan"

# Replace the below string with your own message
string = "Send Using Python!!!"
y_arg = '//input[@class="input-search"][@dir="auto"][@data-tab="2"]'
input_y = wait.until(EC.presence_of_element_located((By.XPATH, y_arg)))
input_y.send_keys(target + Keys.ENTER)

inp_xpath = '//div[@class="input"][@dir="auto"][@data-tab="1"]'
input_box = wait.until(EC.presence_of_element_located((
    By.XPATH, inp_xpath)))
print("Hello!!!")
for i in range(0,2):
   input_box.send_keys(string + Keys.ENTER)
   time.sleep(1)