package com.example.kucherandroid;

public class Situation {
    private String title;
    private String text;
    private int dk;
    private int da;
    private int dr;
    protected Situation[] answers;

    public Situation(String title, String text, int dk, int da, int dr, int answersCount) {
        this.da = da;
        this.title = title;
        this.text = text;
        this.dk = dk;
        this.dr = dr;
        answers = new Situation[answersCount];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDk() {
        return dk;
    }

    public void setDk(int dk) {
        this.dk = dk;
    }

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    public Situation[] getAnswers() {
        return answers;
    }

    public void setAnswers(Situation[] answers) {
        this.answers = answers;
    }
    public static Situation getWindow() {
        Situation start = new Situation("Deal 1", "WindSoft\n" + "1 - answer 1\n" + "2 - answer 2", 0, 0, 0 , 2
        );
        start.answers[0] = new Situation("Deal2","Какой совет ты бы дал себе в подростковом возрасте?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1] = new Situation("Deal3","Кем тебе хотелось стать в детстве?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);

        start.answers[1].answers[0] = new Situation("Deal4","Если бы можно было вернуться в прошлое и что-то изменить в своей жизни, что это было бы?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[1] = new Situation("Deal5","Какое твоё самое любимое детское воспоминание?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[0] = new Situation("Deal6","У тебя есть братья или сёстры? Какие у вас отношения?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[1] = new Situation("Deal7","По каким вещам из детства ты скучаешь?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);

        start.answers[0].answers[1].answers[0] = new Situation("Deal8","Какой из своих недостатков тебе удалось принять и полюбить?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[0].answers[1].answers[1] = new Situation("Deal9","Если бы у тебя было неограниченное количество денег, как бы ты распланировал свой идеальный день?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[0].answers[0].answers[0] = new Situation("Deal10","Если бы образование, опыт и деньги не имели значения, какую профессию ты бы выбрал?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[0].answers[0].answers[1] = new Situation("Deal11","Лучший совет, который тебе когда-либо давали?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);

        start.answers[1].answers[1].answers[0] = new Situation("Deal12","Что тебя беспокоит сейчас?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[1].answers[1].answers[1] = new Situation("Deal13","Что тебя мотивирует?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[1].answers[0].answers[0] = new Situation("Deal14","За что ты испытываешь благодарность?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[1].answers[0].answers[1] = new Situation("Deal15","Если бы тебя заморозили, через сколько лет тебе хотелось бы проснуться?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);



        start.answers[0].answers[1].answers[0].answers[0] = new Situation("Deal16","Каким был самый запоминающийся комплимент в твоей жизни?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[1].answers[1].answers[0] = new Situation("Deal17","Что тебе хотелось бы в себе изменить?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[1].answers[0].answers[1] = new Situation("Deal18","Когда ты последний раз плакал?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[1].answers[1].answers[1] = new Situation("Deal19","Что для тебя самое удивительное?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);

        start.answers[0].answers[0].answers[0].answers[0] = new Situation("Deal20","Кто из твоих друзей, по-твоему, нравится мне больше всех? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[0].answers[1].answers[0] = new Situation("Deal21","Какая сумма карманных денег идеальна для тебя и как бы ты ею распорядился?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[0].answers[0].answers[0].answers[1] = new Situation("Deal22","Расскажи мне о своём лучшем учителе.\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[0].answers[0].answers[1].answers[1] = new Situation("Deal23","Если бы джинн позволил тебе осуществить только одно желание, что бы ты выбрал и почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);


        start.answers[1].answers[1].answers[0].answers[0] = new Situation("Deal24","Когда тебе грустно, что поднимает тебе настроение?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[1].answers[1].answers[0] = new Situation("Deal25","Какое моё наказание ты посчитал действительно несправедливым? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[1].answers[0].answers[1] = new Situation("Deal26","Если бы ты мог изменить три вещи в себе, что бы это было?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 2);
        start.answers[1].answers[1].answers[1].answers[1] = new Situation("Deal27","О чём врут твои друзья своим родителям?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);

        start.answers[1].answers[0].answers[0].answers[0] = new Situation("Deal28","Какие качества должны быть у хорошего друга?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[0].answers[1].answers[0] = new Situation("Deal29","Расскажи мне о своей любимой игрушке, которая была у тебя, когда ты был маленьким.\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[0].answers[0].answers[1] = new Situation("Deal30","Если бы ты испугался, какие мои слова тебя утешат?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);
        start.answers[1].answers[0].answers[1].answers[1] = new Situation("Deal31","Если бы ты мог украсить наш дом, как бы он выглядел?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 2);



        start.answers[0].answers[1].answers[1].answers[1].answers[0] = new Situation("Deal32","Глядя на свои фото, как думаешь, когда ты был симпатичнее всего?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[1].answers[1].answers[1] = new Situation("Deal33","Как ты думаешь, что характеризует хорошего родителя?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[1].answers[0].answers[0] = new Situation("Deal34","Какое половое воспитание, по-твоему, дети должны получить в школе?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[1].answers[0].answers[1] = new Situation("Deal35","Какое совместное дело или событие в нашей семье в этом году было для тебя самым приятным?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[0].answers[1].answers[0].answers[1].answers[0] = new Situation("Deal36","В каком возрасте дети влюбляются?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[0].answers[1].answers[1] = new Situation("Deal37","Как ты думаешь, что находится за звёздами?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[0].answers[0].answers[0] = new Situation("Deal38","Какую самую приятную вещь твой друг делал для тебя?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[1].answers[0].answers[0].answers[1] = new Situation("Deal39","Назови 2 вещи, которые наша семья обязательно должна делать в выходные.\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[0].answers[0].answers[1].answers[1].answers[0] = new Situation("Deal40","Страдают ли дети от развода родителей?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[1].answers[1].answers[1] = new Situation("Deal41","Кого ты считаешь самым опасным ребёнком? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[1].answers[0].answers[0] = new Situation("Deal42","Веришь ли ты в рай? Если нет, то почему? Если да, то как ты его себе представляешь?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[1].answers[0].answers[1] = new Situation("Deal43","Если бы ты захотел завести необычное животное, кто бы это был?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[0].answers[0].answers[0].answers[1].answers[0] = new Situation("Deal44","Честность — всегда лучшая политика? Почему да и почему нет?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[0].answers[1].answers[1] = new Situation("Deal45","Какими своими достижениями в учёбе, спорте и др. ты особенно гордишься?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[0].answers[0].answers[0] = new Situation("Deal46","Кем из своих друзей ты гордишься больше других? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[0].answers[0].answers[0].answers[0].answers[1] = new Situation("Deal47","Снился ли тебе сон, который тебя действительно напугал? О чём он был?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);




        start.answers[1].answers[1].answers[1].answers[1].answers[0] = new Situation("Deal48","Опиши самое красивое место, которое ты когда-нибудь посещал?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[1].answers[1].answers[1] = new Situation("Deal49","Описывал ли ты меня своим друзьям?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[1].answers[0].answers[0] = new Situation("Deal50","Была ли в твоей жизни настоящая потеря? Если да, то расскажи мне о ней. Что ты чувствовал?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[1].answers[0].answers[1] = new Situation("Deal51","Как ты думаешь, ты живёшь в опасном окружении? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[1].answers[1].answers[0].answers[1].answers[0] = new Situation("Deal52","Не считая нашу религию, какая ещё религия тебе интересна? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[0].answers[1].answers[1] = new Situation("Deal53","Какова самая грубая (жестокая) вещь, о которой ты думаешь (знаешь)?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[0].answers[0].answers[0] = new Situation("Deal54","Кем из исторических личностей ты хотел бы быть?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[1].answers[0].answers[0].answers[1] = new Situation("Deal55","Какой возраст подходит для вступления в брак? Почему?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[1].answers[0].answers[1].answers[1].answers[0] = new Situation("Deal56","Скажи мне три вещи, которые ты помнишь о детском садике. \n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[1].answers[1].answers[1] = new Situation("Deal57","Кто из ребят популярен в твоём классе? Что делает человека популярным?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[1].answers[0].answers[0] = new Situation("Deal58","Тебе когда-нибудь предлагали попробовать наркотики? Как ты отреагировал?\n 1 - могу ответить \n 2 - не могу ответить ", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[1].answers[0].answers[1] = new Situation("Deal59","Если бы ты узнал, что твой друг украл что-то, что бы ты сделал?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        start.answers[1].answers[0].answers[0].answers[1].answers[0] = new Situation("Deal60","Если бы ты мог поменяться жизнями с кем-либо, кто бы это был?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[0].answers[1].answers[1] = new Situation("Deal61","Представь, что ты будешь первым человеком, который встретит пришельца из космоса. Что ты почувствуешь, скажешь, спросишь?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[0].answers[0].answers[0] = new Situation("Deal62","Что бы ты сделал, если бы на день стал невидимкой? \n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);
        start.answers[1].answers[0].answers[0].answers[0].answers[1] = new Situation("Deal63","Какие твои самые ранние воспоминания?\n 1 - могу ответить \n 2 - не могу ответить", 10, 10, -10, 0);

        return start;
    }
}

