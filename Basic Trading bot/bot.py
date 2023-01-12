import websocket
import json
import time
import talib
import numpy as np

# Connect to Binance WebSocket
ws = websocket.WebSocket()
ws.connect("wss://stream.binance.com:9443/ws/btcusdt@kline_1m")

# Continuously receive data from WebSocket
while True:
    data = json.loads(ws.recv())
    close_prices = [float(x[4]) for x in data['k']['c']]
    timestamp = [x[6] for x in data['k']['t']]

    # Calculate RSI using talib library
    rsi = talib.RSI(np.array(close_prices), timeperiod=14)
    current_rsi = rsi[-1]
    print("RSI:", current_rsi)

    # Check if RSI is overbought or oversold
    if current_rsi > 70:
        print("RSI is overbought.")
    elif current_rsi < 30:
        print("RSI is oversold.")
    time.sleep(1)

ws.close()
