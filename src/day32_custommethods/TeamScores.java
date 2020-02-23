package day32_custommethods;

public class TeamScores {
    public static void main(String[] args) {
        int [] [] teamScores = {{3,5,9,10,1},{4,9,2,8,7},
                                 {9,8,5,3,1},{2,2,2,5,9}};
        int highestScore = 0;
        int winner = -1;

        for(int team = 0; team< teamScores.length; team++) {
            int sum = 0;// we declare it inside so whenever we go to next team it reset to zero
            for (int score = 0; score < teamScores[team].length; score++) {
                sum += teamScores[team][score];
            }
            System.out.println("team = " + (team+1) + " Sum " + sum);
            if (sum > highestScore) { // sum needs to greater than so it can be resign to highScore
                // if we put less than sum< highScore it would always result in zero bc its not resigning
                highestScore = sum;
                winner = team +1;
            }
        }
        System.out.println("Winner Team : " + winner +" with score: "+highestScore);

    }
    }

