import java.util.Scanner;

public class Ipa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT[] arr = new RRT[4];

        // Input RRT data
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt(); sc.nextLine(); // Ticket number
            String b = sc.nextLine(); // Raised by
            String c = sc.nextLine(); // Assigned to
            int d = sc.nextInt(); sc.nextLine(); // Priority
            String e = sc.nextLine(); // Project
            arr[i] = new RRT(a, b, c, d, e);
        }

        String pr = sc.nextLine(); // Input project name
        RRT ans = gHPT(pr, arr);

        // Output result
        if (ans != null) {
            System.out.println(ans.getTno());
            System.out.println(ans.getRaiby());
            System.out.println(ans.getAssto());
        } else {
            System.out.println("No such ticket.");
        }
        sc.close();
    }

    public static RRT gHPT(String pr, RRT[] arr) {
        RRT[] filteredArr = new RRT[arr.length];
        int count = 0;

        // Filter tickets based on project name
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProject().equalsIgnoreCase(pr)) {
                filteredArr[count] = arr[i];
                count++;
            }
        }

        if (count == 0) {
            return null; // No tickets matched the project name
        }

        // Sort the filtered tickets by priority in descending order
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (filteredArr[j].getPrior() < filteredArr[j + 1].getPrior()) {
                    RRT temp = filteredArr[j];
                    filteredArr[j] = filteredArr[j + 1];
                    filteredArr[j + 1] = temp;
                }
            }
        }

        return filteredArr[0]; // Return the ticket with the highest priority
    }
}

class RRT {
    int tNo;
    String raiBy;
    String assTo;
    int prior;
    String project;

    public RRT(int tNo, String raiBy, String assTo, int prior, String project) {
        this.tNo = tNo;
        this.raiBy = raiBy;
        this.assTo = assTo;
        this.prior = prior;
        this.project = project;
    }

    public int getTno() {
        return tNo;
    }

    public void setTno(int tNo) {
        this.tNo = tNo;
    }

    public String getRaiby() {
        return raiBy;
    }

    public void setRaiby(String raiBy) {
        this.raiBy = raiBy;
    }

    public String getAssto() {
        return assTo;
    }

    public void setAssto(String assTo) {
        this.assTo = assTo;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
