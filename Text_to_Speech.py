from gtts import gTTS
import os
tts = gTTS(text='Good morning Swaroop', lang='en')
tts.save("good.mp3")
os.system("good.mp3")
