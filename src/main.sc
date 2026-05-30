theme: /

    state: /hello
        intent!: /hello
        q!: *start
        q!: * (привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь)/hello/hi)
        a: Привет привет

    state: /weather
        intent!: /weather
        q!: * (~погода/~прогноз/что на улице/weather/дождь/завтра) *
        a: Сегодня солнечно

    state: /currency
        intent!: /currency
        q!: * (~обмен/~рубль/доллар/евро) *
        a: Актуальный курс валют

    state: /NoMatch
        event!: noMatch
        a: Я не понял. Переформулируйте.