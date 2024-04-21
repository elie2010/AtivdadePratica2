public class Sistema {

    private static void exibirMenu () {

        System.out.println("\nCadastro de alunos:");
        System.out.println("1)Cadastrar aluno:");
        System.out.println("2)Cadastrar professor:");
        System.out.println("3)Listar colaboradores:");
        System.out.println("4)Listar professores:");
        System.out.println("5)Remover colaborador:");
        System.out.println("6)Remover lista:");
        System.out.println("0)Finalizar progama:");
        System.out.print("Informe opção: ");
        
    }

    private static void verificarOpcao (int op) {

        String nome;
        String email;
        int matricula;


        switch (op) {
            case 1:
                System.out.println("\nCadastro aluno:");
                System.out.print("Nome:");
                nome = Console.lerString();
                System.out.print("E-mail:");
                email = Console.lerString();
                System.out.print("Matrícula:");
                matricula = Console.lerInt();

                Aluno aluno = new Aluno(nome, email, matricula);
                Cadastro.cadastar(aluno);

                System.out.println("Aluno cadastrado:");
                break;
        
            case 2:
                
                System.out.println("\nCadastro professor:");
                System.out.print("Nome:");
                nome = Console.lerString();
                System.out.print("E-mail:");
                email = Console.lerString();
                System.out.print("Matrícula:");
                matricula = Console.lerInt();
                System.out.print("Matérica aplicada:");
                String materiaaplicada = Console.lerString();

                Professor professor = new Professor(nome, email, matricula, materiaaplicada);
                Cadastro.cadastar(professor);

                System.out.println("\nProfessor cadastrado:");

                break;

            case 3:

                if (Cadastro.getlistaAlunos().size() == 0 ) {
                    System.out.println("\nNão há colaboradores cadstrados...");
                    break;
                }
                System.out.println("\nColaboradores cadastrados:");
                for(Aluno tempAluno : Cadastro.getlistaAlunos()){
                    System.out.println(tempAluno);
                }

                break;

            case 4:

                if (Cadastro.getlistaAlunos().size() == 0 ) {
                    System.out.println("\nNão há professores cadstrados...");
                    break;
                }
                System.out.println("\nProfessores cadatrados:");
                for (Aluno tempAluno : Cadastro.getProfessor()){
                    System.out.println(tempAluno);
                }

                break;

            case 5:

                System.out.println("\nRemover colaborador:");
                System.out.print("\nInforme matrícula:");
                matricula = Console.lerInt();

                if (Cadastro.excluir(matricula)){
                    System.out.println("\nColaborador removido com sucesso....");
                } else {
                    System.out.println("\nColaborador " + matricula + " não localizado");
                }

                break;

            case 6:

                System.out.println("\nApagar lista:");
                if (Cadastro.excluirLista()){
                    System.out.println("\nLista excluida");
                }

                break;

            case 0:

                System.out.println("\nPrograma finalizado....");
                
                break;

            default:

                    System.out.println("\nOpção invalída. Digite novamente:");
            
                break;
        }
    
    }

    public static void executar(){

        int op;

        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
            
        } while (op != 0);

    }






}
