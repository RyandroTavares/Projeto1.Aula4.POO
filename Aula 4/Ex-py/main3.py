import requests

requisicao = requests.get("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL")

requisicaoJson = requisicao.json()

print(requisicaoJson["USDBRL"]["bid"])