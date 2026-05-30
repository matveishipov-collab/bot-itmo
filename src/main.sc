require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

state: Start
    event: start
        go!: /hello

    intent: weather
        go!: /weather

    intent: currency
        go!: /currency

    q: *
        go!: /NoMatch

state: /hello
    a: Привет! Я бот-помощник. Могу рассказать о погоде и курсах валют.

    intent: weather
        go!: /weather

    intent: currency
        go!: /currency

    q: *
        go!: /NoMatch

state: /weather
    a: Сейчас я могу сообщить только тестовый прогноз погоды.

    intent: currency
        go!: /currency

    intent: weather
        a: Сейчас я могу сообщить только тестовый прогноз погоды.

    q: *
        go!: /NoMatch

state: /currency
    a: Сейчас я могу сообщить только тестовый курс валют.

    intent: weather
        go!: /weather

    intent: currency
        a: Сейчас я могу сообщить только тестовый курс валют.

    q: *
        go!: /NoMatch

state: /NoMatch
    a: Извините, я не понял запрос. Спросите меня о погоде или курсах валют.