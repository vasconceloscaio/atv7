/**
 *
 * @vasconceloscaio
 */
public class Aluno {

    private String m1;
    private String m2;
    private float media;

    public void calc_media() {
        float m1 = Float.parseFloat(this.m1);
        float m2 = Float.parseFloat(this.m2);
        this.media = ((m2 * 2) + m1) / 3;

    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public float getMedia() {
        return media;
    }

}