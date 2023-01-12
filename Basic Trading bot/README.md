# Binance RSI Alert

This script connects to Binance's WebSocket API and receives a stream of 1-minute candlestick data for the BTC/USDT pair. It then uses the [TA-Lib](https://mrjbq7.github.io/ta-lib/) library to calculate the 14-period relative strength index (RSI) of the close prices. The script continuously prints out the current RSI value and check if it's overbought or oversold by comparing it to 70 or 30 respectively.

## Prerequisites
- Python 3.x
- [websocket-client](https://pypi.org/project/websocket-client/) library
- [TA-Lib](https://mrjbq7.github.io/ta-lib/install.html) library

## Installation

1. Install TA-Lib:
    - Windows: Download the installer from [here](https://www.lfd.uci.edu/~gohlke/pythonlibs/#ta-lib) and run it. 
    - Linux: `sudo apt-get install ta-lib`
    - MacOS: `brew install ta-lib`

2. Clone this repository and navigate into the cloned directory:
```
git clone 
cd 
```
3. Install the required libraries:
```
pip install -r requirements.txt
```

## Usage

1. Run the script:
python bot.py

2. The script will start printing the RSI value, and if it's overbought or oversold.

## Note

- This script is for demonstration purposes only and should not be used in a production environment without proper error handling and additional functionality.
- You may need to install the 'websocket-client' and 'TA-Lib' library to run this code snippet.
- Also, you may need to have API key from Binance in order to use this script.
- This script is using only 1min time frame, you can change it to higher time frame as per your requirement.
