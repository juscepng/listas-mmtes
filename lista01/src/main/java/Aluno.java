public class Aluno {

    int a1;
    int a2;
    int a3;
    int ai;
    int totalNote;

    public Aluno(int a1, int a2, int a3, int ai) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.ai = ai;
    }

    public int finalNote() {
        totalNote = calcFinalNote();

        if(totalNote > 70){
            return totalNote;
        } else {
            int minorNote = Math.min(a1, a2);

            if(minorNote == a1){
                a1 = ai;
            } else {
                a2 = ai;
            }
            totalNote = calcFinalNote();
            return totalNote;
        }
    }

    public int approval() {
        totalNote = calcFinalNote();

        if(totalNote >= 70){
            return 1;
        } else {
            int minorNote = Math.min(a1, a2);

            if(minorNote == a1){
                a1 = ai;
            } else {
                a2 = ai;
            }

            int calcNote = calcFinalNote();

            if(calcNote >= 70){
                return 2;
            } else {
                return 3;
            }
        }
    }

    public int calcFinalNote(){
        return a1 + a2 + a3;
    }
}
