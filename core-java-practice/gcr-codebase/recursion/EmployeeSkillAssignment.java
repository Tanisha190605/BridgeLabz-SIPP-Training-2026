import java.util.*;
public class EmployeeSkillAssignment {
    static void findTeams(int[] skills, int index, int target, List<Integer> team, int sum) {
        if(sum == target) {
            System.out.println(team);
            return;
        }
        if(index == skills.length || sum > target) {
            return;
        }
        team.add(skills[index]);
        findTeams(skills, index + 1, target, team, sum + skills[index]);
        team.remove(team.size() - 1);
        findTeams(skills, index + 1, target, team, sum);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] skills = new int[n];
        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }
        System.out.print("Enter target skill score: ");
        int target = sc.nextInt();
        System.out.println("Possible Teams:");
        findTeams(skills, 0, target, new ArrayList<>(), 0);
        sc.close();
    }
}