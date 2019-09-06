import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String answer = "";
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to Victor's Adventure!");
        System.out.println("We can move to to 5 rooms, ");
        System.out.println("please select a room from 1-5: ");
        answer = key.next();
        if(answer.equalsIgnoreCase("1")){

            System.out.println("Now in Room 1, now choose between two options, 1-2: ");
            answer = key.next();
            if (answer.equalsIgnoreCase("1")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
            else if (answer.equalsIgnoreCase("2")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
        }
        else if(answer.equalsIgnoreCase("2")){
            System.out.println("Now in Room 2, choose between two options, 1-2: ");
            answer = key.next();
            if (answer.equalsIgnoreCase("1")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
            else if (answer.equalsIgnoreCase("2")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
        }
        else if(answer.equalsIgnoreCase("3")){
            System.out.println("Now in room 3, choose between two options, 1-2: ");
            answer = key.next();
            if (answer.equalsIgnoreCase("1")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
            else if (answer.equalsIgnoreCase("2")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
        }
        else if(answer.equalsIgnoreCase("4")){
            System.out.println("Now in room 4, choose between two options, 1-2: ");
            answer = key.next();
            if (answer.equalsIgnoreCase("1")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("Choose between two options, 1-2: ");
                    answer = key.next();
                    if(answer.equalsIgnoreCase("1")){
                        System.out.println("You SURVIVED...");
                    }
                    else if (answer.equalsIgnoreCase("2")){
                        System.out.println("You DIED...");
                    }
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("Choose between two options, 1-2: ");
                    answer = key.next();
                    if(answer.equalsIgnoreCase("1")){
                        System.out.println("You survived...");
                    }
                    else if (answer.equalsIgnoreCase("2")){
                        System.out.println("You died...");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("2")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
        }
        else if(answer.equalsIgnoreCase("5")){
            System.out.println("Now in room 5, choose between two options, 1-2: ");
            answer = key.next();
            if (answer.equalsIgnoreCase("1")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("Choose between two options, 1-2: ");
                    answer = key.next();
                    if(answer.equalsIgnoreCase("1")){
                        System.out.println("You SURVIVED...");
                    }
                    else if (answer.equalsIgnoreCase("2")){
                        System.out.println("You DIED...");
                    }
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("Choose between two options, 1-2: ");
                    answer = key.next();
                    if(answer.equalsIgnoreCase("1")){
                        System.out.println("You survived...");
                    }
                    else if (answer.equalsIgnoreCase("2")){
                        System.out.println("You died...");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("2")){
                System.out.println("Choose between two options, 1-2: ");
                answer = key.next();
                if (answer.equalsIgnoreCase("1")){
                    System.out.println("You DIED...");
                }
                else if (answer.equalsIgnoreCase("2")){
                    System.out.println("You SURVIVED...");
                }
            }
        }
    }
}
