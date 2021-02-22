package com.manko.model.enums;

/**
 * Created by Yevheniia Manko on 10.11.2020.
 */
public enum NeedCard {

    ENERGY("ЕНЕРГІЯ", "ЭНЕРГИЯ"), HEALTH("ЗДОРОВ’Я", "ЗДОРОВЬЕ"),
    MOVEMENT("РУХ", "ДВИЖЕНИЕ"), REST("ВІДПОЧИНОК", "ОТДЫХ"),
    SAFETY("БЕЗПЕКА", "БЕЗОПАСНОСТЬ"), SEXUAL_EXPRESSION("СЕКСУАЛЬНЕ ВИРАЖЕННЯ", "СЕКСУАЛЬНОЕ ВЫРАЖЕНИЕ"),
    CLARITY("ЯСНІСТЬ", "ЯСНОСТЬ"), DEVELOPMENT("РОЗВИТОК", "РАЗВИТИЕ"),
    OPENNESS("ВІДКРИТІСТЬ", "ОТКРЫТОСТЬ"), MINDFULNESS("УСВІДОМЛЕНІСТЬ", "ОСОЗНАННОСТЬ"),
    UNDERSTANDING("РОЗУМІННЯ", "ПОНИМАНИЕ"), HONESTY("ЧЕСНІСТЬ", "ЧЕСНОСТЬ"),
    ADVENTURE("ПРИГОДА", "ПРИКЛЮЧЕНИЕ"), CONNECTION("ЗВ'ЯЗОК", "СВЯЗЬ"),
    BELONGING("ПРИНАЛЕЖНІСТЬ", "ПРИНАДЛЕЖНОСТЬ"), CLOSENESS("БЛИЗЬКІСТЬ", "БЛИЗОСТЬ"),
    CONSISTENCY("УЗГОДЖЕНІСТЬ", "СОГЛАСОВАННОСТЬ"), FRIENDSHIP("ДРУЖБА", "ДРУЖБА"),
    COOPERATION("СПІВПРАЦЯ", "СОТРУДНИЧЕСТВО"), MUTUALITY("ВЗАЄМНІСТЬ", "ВЗАИМНОСТЬ"),
    ;

    /*
PARTICIPATION  УЧАСТЬ  УЧАСТИЕ
SUPPORT  ПІДТРИМКА  ПОДДЕРЖКА
EMPATHY  ЕМПАТІЯ  ЭМПАТИЯ
COMPASSION  СПІВЧУТТЯ  СОЧУСТВИЕ
LOVE  ЛЮБОВ  ЛЮБОВЬ
CHALLENGE  ВИКЛИК  ВЫЗОВ
JOY  РАДІСТЬ  РАДОСТЬ
PLAY  ГРА  ИГРА
PLEASURE  НАСОЛОДА  НАСЛАЖДЕНИЕ
MUTUAL RESPECT  ВЗАЄМНА ПОВАГА  ВЗАИМНОЕ УВАЖЕНИЕ
RELIABILITY  НАДІЙНІСТЬ  НАДЕЖНОСТЬ
AUTONOMY  АВТОНОМІЯ  АВТОНОМИЯ

FREEDOM  СВОБОДА  СВОБОДА
CHOICE  ВИБІР  ВЫБОР
MEANING  ЗНАЧЕННЯ  СМЫСЛ
SPACE  ПРОСТІР  ПРОСТРАНСТВО
CELEBRATION  СВЯТКУВАННЯ  ПРАЗДНОВАНИЕ
CONTRIBUTION  ВНЕСОК  ВКЛАД
CREATIVITY  КРЕАТИВНІСТЬ  КРЕАТИВНОСТЬ
INTEGRITY  ЦІЛІСНІСТЬ  ЦЕЛОСТНОСТЬ
MOURNING  ОПЛАКУВАННЯ  ОПЛАКИВАНИЕ
PEACE  СПОКІЙ  СПОКОЙСТВИЕ

BEAUTY  КРАСА  КРАСОТА
EASE  ЛЕГКІСТЬ  ЛЕГКОСТЬ
EQUAL OPPORTUNITIES  РІВНІ МОЖЛИВОСТІ  РАВНЫЕ ВОЗМОЖНОСТИ
HARMONY  ГАРМОНІЯ  ГАРМОНИЯ
STABILITY  СТАБІЛЬНІСТЬ  СТАБИЛЬНОСТЬ
CARE  ТУРБОТА  ЗАБОТА
SELF-ACCEPTANCE  ПРИЙНЯТТЯ СЕБЕ  ПРИНЯТИЕ СЕБЯ
SELF-ACTUALIZATION  САМОАКТУАЛІЗАЦІЯ  САМОАКТУАЛИЗАЦИЯ

     */

    private String nameUkr;
    private String nameRus;

    NeedCard(String nameUkr, String nameRus) {
        this.nameUkr = nameUkr;
        this.nameRus = nameRus;
    }

    public String getNameUkr() {
        return nameUkr;
    }

    public String getNameRus() {
        return nameRus;
    }
}
