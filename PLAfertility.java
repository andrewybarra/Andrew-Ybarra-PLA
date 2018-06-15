
package plafertility;

import java.util.Scanner;


public class PLAfertility {
    
	static double learnRate = 0.5;  
	static int threshold = 0;  

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                         
		double[] season = {-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,
                    -0.33,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                    -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-0.33,-0.33,-0.33,-0.33,
                    -0.33,-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,1,1,
                    -1,-1,-1,-1,-0.33,-0.33,-0.33,-0.33,-0.33,-0.33,0.33,1,-1,
                    -1,-1,-1,-1,-1,-1,-0.33,-1,-0.33,-0.33,-0.33,-0.33,-0.33,
                    -0.33,-0.33,-0.33,-0.33,0.33,0.33,0.33,1,-1,-1,-1,-1,-1};    
		double[] age = {0.69,0.94,0.5,0.75,0.67,0.67,0.67,1,0.64,0.61,
                    0.67,0.78,0.75,0.81,0.94,0.81,0.64,0.69,0.75,0.67,0.67,0.75,
                    0.67,0.69,0.56,0.67,0.67,0.78,0.58,0.67,0.61,0.56,0.64,0.58,
                    0.56,0.78,0.78,0.56,0.67,0.69,0.53,0.56,0.58,0.56,0.53,0.53,
                    0.56,0.72,0.64,0.75,0.67,0.53,0.53,0.58,0.61,0.58,0.53,0.69,
                    0.56,0.58,0.56,0.64,0.61,0.56,0.53,0.56,0.5,0.5,0.5,0.5,0.5,
                    0.69,0.56,0.5,0.53,0.78,0.75,0.72,0.53,1,0.92,0.81,0.92,
                    0.86,0.78,0.89,0.75,0.75,0.83,0.81,0.81,0.78,0.75,0.75,0.58,
                    0.67,0.61,0.67,0.64,0.69};
                double[] disease = {0,1,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,
                    1,1,1,1,1,1,0,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
                    1,1,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                    1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
                double[] trauma = {1,0,0,1,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1,0,0,0,
                    1,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,0,1,
                    1,1,0,0,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,
                    0,1,0,1,1,1,1,1,1,0,1,0,0,0,0,1,0,1};
                double[] surgury = {1,1,0,1,0,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,
                    0,1,1,0,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1,1,1,0,
                    0,1,1,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,1,0,1,0,1,
                    0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,1,1,1};
                double[] fever = {0,0,0,0,0,0,-1,0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,
                    0,-1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,-1,0,1,1,0,0,0,0,0,
                    1,0,-1,0,0,0,-1,0,1,1,1,0,1,1,0,-1,1,1,-1,-1,1,1,1,1,1,1,1,
                    1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0};
                double[] alcohol = {0.8,0.8,1,1,0.8,0.8,0.8,0.6,0.8,1,0.8,0.6,
                    0.8,1,0.2,1,1,0.8,1,0.8,0.8,0.6,0.8,1,1,1,0.6,0.6,1,0.6,1,1,
                    1,0.8,1,0.6,1,1,0.6,1,0.8,0.8,0.8,1,1,1,1,0.6,0.8,0.6,0.8,1,
                    0.8,0.8,1,0.8,0.8,1,0.4,0.8,0.8,1,0.6,1,0.8,1,0.8,1,0.8,0.8,
                    0.8,1,0.6,0.8,0.8,1,0.6,0.8,0.8,0.6,1,0.8,0.6,1,1,0.6,0.6,
                    0.8,1,1,0.8,1,0.8,0.8,0.6,1,0.8,1,1,0.6};
                double[] smoke = {0,1,-1,-1,-1,0,-1,-1,-1,-1,0,0,1,-1,-1,1,-1,
                    -1,1,1,-1,0,-1,-1,-1,-1,-1,-1,-1,0,-1,-1,-1,0,-1,-1,-1,-1,0,
                    -1,1,1,1,-1,0,0,-1,1,-1,-1,-1,-1,0,0,-1,1,0,-1,1,1,0,1,-1,
                    -1,-1,-1,0,-1,0,-1,0,-1,0,-1,-1,1,0,-1,-1,0,-1,0,-1,-1,1,1,
                    1,1,-1,1,-1,1,-1,-1,1,-1,0,-1,0,-1};
                double[] sit = {0.88,0.31,0.5,0.38,0.5,0.5,0.44,0.38,0.25,0.25,
                    0.31,0.13,0.25,0.38,0.25,0.5,0.38,0.25,0.25,0.38,0.25,0.25,
                    0.25,0.44,0.63,0.25,0.38,0.38,0.19,0.5,0.63,0.44,0.63,0.44,
                    0.63,0.38,0.25,0.63,0.5,0.31,0.5,0.5,0.5,0.44,0.31,0.44,
                    0.63,0.19,0.31,0.19,0.19,0.75,0.5,0.19,0.63,0.19,0.75,0.75,
                    0.63,0.44,1,0.25,0.38,0.5,0.31,0.56,0.88,0.47,0.31,0.5,0.88,
                    0.31,0.5,0.44,0.63,0.25,0.56,0.19,0.38,0.25,0.63,0.19,0.19,
                    0.25,0.06,0.31,0.25,0.25,0.31,0.38,0.38,0.06,0.38,0.44,0.5,
                    0.5,0.5,0.31,0.19,0.19};
                int[] classification = {1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,
                    0,1,1,0,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                    1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,
                    1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1};

                double count = 0;
                double ageCount = 0;
                double ageD = 0;
    
		double[] weights = new double[10];                             
		double Ein;
                double totalError;
		int result;

		weights[0] = 1;
		weights[1] = 1;
		weights[2] = 1;
                weights[3] = 1;
                weights[4] = 1;
                weights[5] = 1;
                weights[6] = 1;
                weights[7] = 1;
                weights[8] = 1;
                weights[9] = 1;

		do{
			count++;
			totalError = 0;
                        
			for (int i = 20; i <40 ; i++)           // sampling from samples 20-39 (19 total samples) 20 40
                        {
                            
				result = calcClass(threshold, weights, season[i], age[i], disease[i], trauma[i], surgury[i],
                                        fever[i], alcohol[i], smoke[i], sit[i]);
                                
				Ein = classification[i] - result;
                                
				weights[0] += learnRate * Ein * season[i];
				weights[1] += learnRate * Ein * age[i];
				weights[2] += learnRate * Ein * disease[i];
                                weights[3] += learnRate * Ein * trauma[i];
				weights[4] += learnRate * Ein * surgury[i];
				weights[5] += learnRate * Ein * fever[i];
                                weights[6] += learnRate * Ein * alcohol[i];
				weights[7] += learnRate * Ein * smoke[i];
				weights[8] += learnRate * Ein * sit[i];
				weights[9] += learnRate * Ein;
                                
				totalError = totalError + (Ein*Ein);
			}
                        //System.out.println(totalError);
                        
		} while (totalError != 0 && count<=70);                         //minimized total error to .2 with 70 // 27

		
                int answer;
                do{
                    System.out.print("\n\tMENU\n\n"
                                + "Input Patient Info [1]\n"
                                + "Patient Lookup     [2]\n"
                                + "Accuracy Results   [3]\n"
                            +   "\nEXIT               [0]\n\n");
                    
                    answer = input.nextInt();

                    switch (answer) {
                        case 1:
                            inputSample(weights);
                            break;
                        case 2:
                            patientLookup(weights, season, age, disease, trauma, surgury,fever, alcohol, smoke, sit, classification);
                            break;
                        case 3:
                            accuracy(weights, season, age, disease, trauma, surgury,fever, alcohol, smoke, sit, classification);
                            break;
                        default:
                            break;
                    }
                    line();
                    
                } while(answer != 0);	
	}
    	
            static int calcClass(int theta, double weights[], double season, double age, double disease, double trauma,
                double surgury, double fever, double alcohol, double smoke, double sit)
	{
		double total = season * weights[0] + age * weights[1] + disease * weights[2] + trauma * weights[3] + 
                        surgury * weights[4] +  fever * weights[5] + alcohol * weights[6] + smoke * weights[7] 
                        + sit * weights[8] + weights[9];
		if(total >= theta)
                    return 1;
                else 
                    return 0;
	}
            static void inputSample(double weights[])
        {
         Scanner input = new Scanner(System.in);
         
                int result;
         
                double s1;
                double a1;
                double d1;
                double t1;
                double sur1;
                double f1;
                double alc1;
                double smo1;
                double sit1;
                
         System.out.print("Please select which season this test is being performed:\n\n"
                 + "Winter [1]\nSpring [2]\nSummer [3]\nFall   [4]\n\nEnter answer here: ");
         
         s1 = getSeason(input.nextDouble());
         line();
         
         System.out.print("\nPlease enter your age [18 - 36]: ");
         a1 = ((input.nextDouble() - 18)/18);
         line();
         
         System.out.print("\nWere you every diagnosed with a childhood disease?\n"
                 + "(ie. chicken pox, measles, mumps, polio)\n\n"
                 + "Yes[1]\nNo [0]\n\nEnter answer here: ");
                 
         d1 = getInverse(input.nextDouble());
         line();
         System.out.print("\nHave you ever been in a serious accident or experienced related trauma:"
                 + "\n\nYes[1]\nNo [0]\n\nEnter answer here: ");
         
         t1 = getInverse(input.nextDouble());
         line();
         
         System.out.print("\nAny history of surgical intervention:"
                 + "\n\nYes[1]\nNo [0]\n\nEnter answer here: ");
         
         sur1 = getInverse(input.nextDouble());
         line();
         
         System.out.print("\nExperienced high fevers in the last year:\n\n"
                 + "Less than three months ago [1]\n"
                 + "More than three months ago [2]\n"
                 + "None of the above          [3]\n\nEnter answer here: ");
         
         f1 = getFever(input.nextDouble());
         line();
                 
         System.out.print("\nFrequency of alcohol consumption:\n"
                 + "Several times a day  [1]\n"
                 + "Every day            [2]\n"
                 + "Several times a week [3]\n"
                 + "Once a week          [4]\n"
                 + "Hardly ever or never [5]\n\nEnter answer here: ");

         alc1 = getAlcohol(input.nextDouble());
         line();
         
         System.out.print("\nSmoking habit:\n"
                 + "Never      [1]\n"
                 + "Occasional [2]\n"
                 + "Daily      [3]\n\nEnter answer here: ");
         
         smo1 = getSmoke(input.nextDouble());
         line();
         
         System.out.print("\nAverage number of hours spent sitting a day [0 - 16]\nEnter answer here: ");
         sit1 = (input.nextDouble()/16);
         
         result = calcClass(threshold,weights, s1, a1, d1, t1, sur1, f1, alc1, smo1, sit1);
		line();
                System.out.print("Results: " + result);
                
                predict(result);
         
            }
            static double getSeason(double season)  
      {
          switch ((int)season) {
                case 1:
                    season = -1.00;
                    break;
                case 2:
                    season = -0.33;
                    break;
                case 3:
                    season = 0.33;
                    break;
                case 4:
                    season = 1.00;
                    break;
                default:
                    break;
            }
          
          return season;
      }
            static double getInverse(double number)
            {   
                if(number == 0)
                {
                    number = 1;
                }
                else if(number == 1)
                {
                    number = 0;
                }
                
                return number;
            }
            static double getFever(double number)
            {
            switch ((int)number) {
                case 0:
                    number = -1.00;
                    break;
                case 1:
                    number = 0.00;
                    break;
                case 3:
                    number = 1.00;
                    break;
                default:
                    break;
            }
               return number;
            }
            static void line()
            {
               System.out.println("\n--------------------------------------------------------------------------");
            }
            static double getAlcohol(double a)
            {
            switch ((int)a) {
                case 1:
                    a = 0;
                    break;
                case 2:
                    a = .25;
                    break;
                case 3:
                    a = .50;
                    break;
                case 4:
                    a = .75;
                    break;
                case 5:
                    a = 1.0;
                    break;
                default:
                    break;
            }
                return a;
            }
            static double getSmoke(double a)
            {
                switch ((int)a) {
                case 1:
                    a = -1;
                    break;
                case 2:
                    a = 0;
                    break;
                case 3:
                    a = 1;
                    break;
                default:
                    break;
            }
                return a; 
            }
            static void patientLookup(double weights[], double season[], double age[], double disease[], double trauma[],
                double surgury[], double fever[], double alcohol[], double smoke[], double sit[], int classification[])
            {
                Scanner input = new Scanner(System.in);
                int i;
                int result;
                
                System.out.print("\nEnter Patient Number [0-99]: ");
                        i = input.nextInt();
                line();
                
                System.out.print("\nPatient #" + i + ":\n\n\tMy Classification:\t");
                result = calcClass(threshold, weights, season[i], age[i], disease[i], trauma[i], surgury[i],
                                        fever[i], alcohol[i], smoke[i], sit[i]);
                System.out.print(result);
                System.out.print("\n\tTrue Classification:\t" + classification[i]);
                line();
             }
            static void accuracy(double weights[], double season[], double age[], double disease[], double trauma[],
                double surgury[], double fever[], double alcohol[], double smoke[], double sit[], int classification[])
            {
                System.out.print("\nThe following test the sample of patients \n"
                        + "from 70-99\n");
                
               int result;
               double count = 0;
               double pass = 0;
               
                for(int i = 70; i < 100; i++)
                {
                result = calcClass(threshold, weights, season[i], age[i], disease[i], trauma[i], surgury[i],
                                        fever[i], alcohol[i], smoke[i], sit[i]);
                
                    if(result == classification[i])
                          count++;
                    
                    pass++;
                }
                
                System.out.printf("\nAccuracy: %.2f", (count/pass));
                System.out.print("\n\t\tPredicted Classifcation\t  Actual Classification"
                               +   "\n\t\t-----------------------\t  -------------------");
                for(int i = 70; i < 100; i++)
                {
                result = calcClass(threshold, weights, season[i], age[i], disease[i], trauma[i], surgury[i],
                                        fever[i], alcohol[i], smoke[i], sit[i]);
                
                System.out.print("\nPatient[" + (i) + "]\t" + result +"\t\t\t  " + classification[i]);
                }
                
                line(); 
                
                System.out.printf("\ny = " + weights[9] + " + " +weights[0] +"*season + %.2f*age +  "+weights[2]+"*disease + "+weights[3]+"*trauma"+weights[4]+" + *surgury + "+
                        weights[5]+"*fever + %.2f*alcohol + "+weights[7]+"*smoke + %.2f*sit\n",weights[1],weights[6], weights[8]);
                
                
            }
            static void predict(int x)
            {
                if(x == 1)
                {
                    System.out.print("\n- You have a 30% chance of concieving within 1 month.\n"
                                   +   "- You have a 60% chance of concieving within 3 months.\n"
                                    +  "- You have a 80% chance of concieving within 6 months.\n"
                            +          "- You have a 85% chance of concieving within 12 months.\n"
                            +          "- You have a 91% chance of concieving within 36 months.\n"
                            +          "- You have a 93% chance of concieving within 48 months.\n");
                }   
                else if(x ==0)
                {
                    System.out.print("\n- You have a 15% chance of concieving within 1 month.\n"
                                   +   "- You have a 30% chance of concieving within 3 months.\n"
                                    +  "- You have a 40% chance of concieving within 6 months.\n"
                            +          "- You have a 45% chance of concieving within 12 months.\n"
                            +          "- You have a 45.2% chance of concieving within 36 months.\n"
                            +          "- You have a 46.2% chance of concieving within 48 months.\n");
                }   
                
            }
            
            
      
    

}



