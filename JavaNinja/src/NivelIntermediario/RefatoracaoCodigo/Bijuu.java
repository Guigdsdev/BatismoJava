package NivelIntermediario.RefatoracaoCodigo;

public enum Bijuu {
    SHUKAKU(1, "Shukaku", "Gaara"),
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yugito Nii"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    int numeroDeCaldas;
    private String nomeBijuu;
    private String jinchuuriki;

    Bijuu() {
    }

    Bijuu(int numeroDeCaldas, String nomeBijuu, String jinchuuriki) {
        this.numeroDeCaldas = numeroDeCaldas;
        this.nomeBijuu = nomeBijuu;
        this.jinchuuriki = jinchuuriki;
    }

}
