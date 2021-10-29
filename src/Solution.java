import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Problem
Submissions
Leaderboard
Discussions
El següent és el preu que ens subministra una empresa de material informàtic per catàleg.

Impresores (500 euros)
Ordinador sobretaula (400 euros)
Portàtils (700 euros)
Discs durs extraïbles (50 euros)
Material complert d'oficina(300 euros)
Volem efectuar un pressupost a partir del nombre de cada tipus que demanem com a paràmetres d'entrada. Cal retornar el preu total.

Input Format

Nombre d'elements de cada tipus que demanem: - Impresores - Ordinador sobretaula - Portàtils - Discs durs extraïbles - Material d'oficina

Constraints

No existeixen restriccions

Output Format

Preu total

Sample Input 0

1
1dfdf
1
1
1
Sample Output 0

1950
Sample Input 1

2
0
5
10
1
Sample Output 1

5300
*/

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int o1 = sc.nextInt()*500;
        int o2 = sc.nextInt()*400;
        int o3 = sc.nextInt()*700;
        int o4 = sc.nextInt()*50;
        int o5 = sc.nextInt()*300;

        System.out.println(o1+o2+o3+o4+o5);


}
