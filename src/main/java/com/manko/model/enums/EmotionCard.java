package com.manko.model.enums;

/**
 * Created by Yevheniia Manko on 09.11.2020.
 */
public enum EmotionCard {

    AMAZED("ЗАХОПЛЕННЯ", "ИЗУМЛЕНИЕ"), CHEERFUL("БАДЬОРІСТЬ", "БОДРОСТЬ"),
    CURIOUS("ЦІКАВІСТЬ, ДОПИТЛИВІСТЬ", "ЛЮБОПЫТСТВО"), INTERESTED("ЗАЦІКАВЛЕНІСТЬ", "ЗАИНТЕРЕСОВАННОСТЬ"),
    SATISFIED("ЗАДОВОЛЕННЯ", "УДОВЛЕТВОРЕНИЕ"), DELIGHTED("ЗАХВАТ", "ВОСТОРГ"),
    ENERGETIC("ЕНЕРГІЙНІСТЬ", "ЭНЕРГИЧНОСТЬ"), EXCITED("ПІДНЕСЕННЯ", "ВООДУШЕВЛЕНИЕ"),
    GRATEFUL("ВДЯЧНІСТЬ", "БЛАГОДАРНОСТЬ"), HAPPY("ЩАСТЯ", "СЧАСТЬЕ"),
    HOPEFUL("НАДІЯ", "НАДЕЖДА"), JOYFUL("РАДІСТЬ", "РАДОСТЬ"), RELIEVED("ПОЛЕГШЕННЯ", "ОБЛЕГЧЕНИЕ"),
    SURPRISED("ЗДИВУВАННЯ", "УДИВЛЕНИЕ"), TOUCHED("ЗВОРУШЕННЯ", "РАСТРОГАННОСТЬ"),
    INSPIRED("НАТХНЕННЯ", "ВДОХНОВЛЕНИЕ"), ENTHUSIASTIC("ЕНТУЗІАЗМ", "ЭНТУЗИАЗМ"),
    OPTIMISTIC("ОПТИМІЗМ", "ОПТИМИЗМ"), OPEN("ВІДКРИТІСТЬ", "ОТКРЫТОСТЬ"), COMFORTABLE("КОМФОРТ", "КОМФОРТ"),
    WARM("ТЕПЛО", "ТЕПЛО"), CALM("СПОКІЙ", "СПОКОЙСТВИЕ"), EXPANDED("НАПОВНЕНІСТЬ", "НАПОЛНЕННОСТЬ"),
    RESTED("ВІДПОЧИНОК", "ОТДОХНУВШИЙ"), BLESSEDNESS("БЛАЖЕНСТВО", "БЛАЖЕНСТВО"),
    CONTRACTED("СКУТІСТЬ", "СКОВАННОСТЬ"), TENSE("НАПРУГА", "НАПРЯЖЕНИЕ"),
    AFRAID("ПОБОЮВАННЯ", "ОПАСЕНИЕ"), FEARFUL("СТРАХ", "СТРАХ"), ANXIOUS("ТРИВОГА", "ТРЕВОГА"),
    WORRIED("СТУРБОВАНІСТЬ", "БЕСПОКОЙСТВО"), CONCERNED("ЗАНЕПОКОЄННЯ", "ОБЕСПОКОЕННОСТЬ"),
    CONFUSED("РОЗГУБЛЕНІСТЬ", "РАСТЕРЯННОСТЬ"), NERVOUS("ЗНЕРВОВАНІСТЬ", "НЕРВОЗНОСТЬ"),
    IRRITATED("РОЗДРАТУВАННЯ", "РАЗДРАЖЕНИЕ"), AGITATED("ЗБУДЖЕННЯ", "ВОЗБУЖДЕННОСТЬ"),
    HESITANT("СУМНІВ, ВАГАННЯ", "СОМНЕНИЕ"), DESPERATE("ВІДЧАЙ", "ОТЧАЯНИЕ"),
    HELPLESS("БЕЗПОМІЧНІСТЬ", "БЕСПОМОЩНОСТЬ"), HOPELESS("БЕЗНАДІЯ", "БЕЗНАДЕЖНОСТЬ"),
    DISAPPOINTED("РОЗЧАРУВАННЯ", "РАЗОЧАРОВАНИЕ"), LONELY("САМОТНІСТЬ", "ОДИНОЧЕСТВО"),
    SAD("СУМ", "ГРУСТЬ"), FRUSTRATED("ФРУСТРАЦІЯ", "ФРУСТРАЦИЯ"),
    SHOCKED("ШОК", "ШОК"), UNCOMFORTABLE("ДИСКОМФОРТ", "ДИСКОМФОРТ"),
    EXHAUSTED("ВИСНАЖЕННЯ", "ИСТОЩЕНИЕ"), PAIN("БІЛЬ", "БОЛЬ"),
    OVERWHELMED("ПЕРЕВАНТАЖЕННЯ", "ПЕРЕГРУЖЕННОСТЬ"), STRESSED("СТРЕС", "СТРЕСС");

    private String nameUkr;
    private String nameRus;

    EmotionCard(String nameUkr, String nameRus) {
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
