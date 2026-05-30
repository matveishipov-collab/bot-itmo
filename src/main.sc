require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

state: Start
    q!: /.*/
        go!: /hello

state: /hello
    a: Привет! Я бот-помощник. Могу рассказать о погоде и курсах валют.
    intent: weather
        go!: /weather
    intent: currency
        go!: /currency
    q!: /.*/
        go!: /NoMatch

state: /weather
    a:
        Погода сейчас недоступна, но обычно здесь отображается прогноз.
    intent: weather
        a: Погода сейчас недоступна, но обычно здесь отображается прогноз.
    intent: currency
        go!: /currency
    q!: /.*/
        go!: /NoMatch

state: /currency
    a:
        Курсы валют сейчас недоступны, но здесь отображается актуальный курс.
    intent: currency
        a: Курсы валют сейчас недоступны, но здесь отображается актуальный курс.
    intent: weather
        go!: /weather
    q!: /.*/
        go!: /NoMatch

state: /NoMatch
    a:
        Извините, я не понял запрос. Спросите меня о погоде или курсах валют.