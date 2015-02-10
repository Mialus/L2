public class Sujet3EnConsole
{
    public static class Case
    {

        public int x;
        public int y;
        public int occupe;

        public Case()
        {
            x = 0;
            y = 0;
            occupe = -1;
        }
    }

    public static class Jeu
    {

        public Joueur joueur[] = {
            new Joueur(), new Joueur()
        };
        public int tours;
        public int nbPions;
        public int nbPC[];

        public Jeu()
        {
            tours = 0;
            nbPions = 0;
            nbPC = new int[7];
        }
    }

    public static class Joueur
    {

        public String nom;
        public Couleur c;

        public Joueur()
        {
            nom = "";
            c = new Couleur();
        }
    }

    public static class Couleur
    {

        public int r;
        public int v;
        public int b;

        public Couleur()
        {
            r = 0;
            v = 0;
            b = 0;
        }
    }


    public Sujet3EnConsole()
    {
    }

    public static void disque(int i, int j, int k)
    {
        int ai[] = new int[k + 1];
        int l = 0;
        int i1 = k;
        int j1 = 1 - k;
        ai[i1] = l;
        for(ai[l] = i1; i1 > l; ai[l] = i1)
        {
            if(j1 < 0)
            {
                j1 += 2 * l + 3;
            } else
            {
                j1 += 2 * (l - i1) + 5;
                i1--;
            }
            l++;
            ai[i1] = l;
        }

        EcranGraphique.drawLine(i + ai[0], j, i - ai[0], j);
        for(int k1 = 1; k1 <= k; k1++)
        {
            EcranGraphique.drawLine(i + ai[k1], j + k1, i - ai[k1], j + k1);
            EcranGraphique.drawLine(i + ai[k1], j - k1, i - ai[k1], j - k1);
        }

    }

    public static Case[][] generationPlateau()
    {
        Case acase[][] = new Case[6][7];
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                acase[i][j] = new Case();
            }

        }

        return acase;
    }

    public static int resultatMenuPrincipal()
    {
        Console.sautDeLigne();
        Console.afficherln(new Object[] {
            " 1: Configurer et jouer"
        });
        Console.afficherln(new Object[] {
            " 0: Quitter"
        });
        Console.afficher(new Object[] {
            "Que voulez vous faire ? "
        });
        int i = Console.saisirInt();
        return i;
    }

    public static int resultatMenuJeu(Jeu jeu)
    {
        Console.sautDeLigne();
        Console.afficherln(new Object[] {
            "Colonne de jeu (0 pour quitter)?"
        });
        int i;
        do
        {
            i = Console.saisirInt();
        } while(i < 0 || i > 7 || i != 0 && jeu.nbPC[i - 1] == 6);
        return i;
    }

    public static void affichagePlateau(Case acase[][], Jeu jeu)
    {
        EcranGraphique.clear();
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                int k = 40 + j * 80;
                int l = 40 + (5 - i) * 80;
                switch(acase[i][j].occupe)
                {
                case -1: 
                    EcranGraphique.setColor(255, 255, 255);
                    disque(k, l, 30);
                    break;

                case 0: // '\0'
                    EcranGraphique.setColor(jeu.joueur[0].c.r, jeu.joueur[0].c.v, jeu.joueur[0].c.b);
                    disque(k, l, 30);
                    break;

                case 1: // '\001'
                    EcranGraphique.setColor(jeu.joueur[1].c.r, jeu.joueur[1].c.v, jeu.joueur[1].c.b);
                    disque(k, l, 30);
                    break;

                case 2: // '\002'
                    EcranGraphique.setColor(jeu.joueur[0].c.r, jeu.joueur[0].c.v, jeu.joueur[0].c.b);
                    disque(k, l, 30);
                    EcranGraphique.setColor(0, 0, 0);
                    disque(k, l, 23);
                    break;

                case 3: // '\003'
                    EcranGraphique.setColor(jeu.joueur[1].c.r, jeu.joueur[1].c.v, jeu.joueur[1].c.b);
                    disque(k, l, 30);
                    EcranGraphique.setColor(0, 0, 0);
                    disque(k, l, 23);
                    break;
                }
            }

        }

        EcranGraphique.flush();
    }

    public static void configurerJeu(Jeu jeu)
    {
        Console.afficherln(new Object[] {
            "Nom du joueur 1?"
        });
        jeu.joueur[0].nom = Console.saisirString();
        Console.afficherln(new Object[] {
            "Nom du joueur 2?"
        });
        jeu.joueur[1].nom = Console.saisirString();
        boolean aflag[] = {
            true, true, true, true, true
        };
        for(int i = 0; i < 2; i++)
        {
            Console.afficher(new Object[] {
                "Couleur du joueur ", Integer.valueOf(i + 1), ", "
            });
            if(aflag[0])
            {
                Console.afficher(new Object[] {
                    "(0: rouge) "
                });
            }
            if(aflag[1])
            {
                Console.afficher(new Object[] {
                    "(1: vert) "
                });
            }
            if(aflag[2])
            {
                Console.afficher(new Object[] {
                    "(2: jaune) "
                });
            }
            if(aflag[3])
            {
                Console.afficher(new Object[] {
                    "(3: cyan) "
                });
            }
            if(aflag[4])
            {
                Console.afficher(new Object[] {
                    "(4: magenta) "
                });
            }
            Console.afficherln(new Object[] {
                "?"
            });
            int j;
            do
            {
                j = Console.saisirInt();
            } while(j < 0 || j > 4 || !aflag[j]);
            aflag[j] = false;
            switch(j)
            {
            case 0: // '\0'
                jeu.joueur[i].c.r = 200;
                jeu.joueur[i].c.v = 0;
                jeu.joueur[i].c.b = 0;
                break;

            case 1: // '\001'
                jeu.joueur[i].c.r = 0;
                jeu.joueur[i].c.v = 200;
                jeu.joueur[i].c.b = 0;
                break;

            case 2: // '\002'
                jeu.joueur[i].c.r = 200;
                jeu.joueur[i].c.v = 200;
                jeu.joueur[i].c.b = 0;
                break;

            case 3: // '\003'
                jeu.joueur[i].c.r = 0;
                jeu.joueur[i].c.v = 200;
                jeu.joueur[i].c.b = 200;
                break;

            case 4: // '\004'
                jeu.joueur[i].c.r = 200;
                jeu.joueur[i].c.v = 0;
                jeu.joueur[i].c.b = 200;
                break;
            }
        }

    }

    public static boolean testAlignement(int i, int j, Case acase[][], int k, int l)
    {
        boolean flag = false;
        int i1 = acase[i][j].occupe;
        if(i1 == 0 || i1 == 1)
        {
            flag = true;
            for(int j1 = 0; j1 < 3 && flag; j1++)
            {
                i = i+k;
                j += l;
                if(acase[i][j].occupe != i1)
                {
                    flag = false;
                }
            }

        }
        return flag;
    }

    public static boolean testAlignements(Case acase[][], int i, int j, int k, int l, int i1, int j1)
    {
        boolean flag = false;
        int k1 = -1;
        int l1 = -1;
        for(int i2 = k; i2 <= l && !flag; i2++)
        {
            for(int k2 = i; k2 <= j && !flag; k2++)
            {
                flag = testAlignement(i2, k2, acase, j1, i1);
                k1 = k2;
                l1 = i2;
            }

        }

        if(flag)
        {
            for(int j2 = 0; j2 < 4; j2++)
            {
                acase[l1][k1].occupe = acase[l1][k1].occupe + 2;
                k1 += i1;
                l1 += j1;
            }

        }
        return flag;
    }

    public static boolean testJeuFini(Case acase[][])
    {
        boolean flag = false;
        flag = testAlignements(acase, 0, 3, 0, 5, 1, 0);
        if(!flag)
        {
            flag = testAlignements(acase, 0, 6, 0, 2, 0, 1);
        }
        if(!flag)
        {
            flag = testAlignements(acase, 0, 3, 0, 2, 1, 1);
        }
        if(!flag)
        {
            flag = testAlignements(acase, 0, 3, 3, 5, 1, -1);
        }
        return flag;
    }

    public static boolean gererJoueur(int i, int j, Jeu jeu, Case acase[][])
    {
        acase[jeu.nbPC[i]][i].occupe = j;
        jeu.nbPC[i]++;
        jeu.nbPions++;
        affichagePlateau(acase, jeu);
        boolean flag = testJeuFini(acase);
        if(flag)
        {
            Console.afficherln(new Object[] {
                jeu.joueur[j].nom, " a gagne!"
            });
        }
        return flag;
    }

    public static void main(String args[])
    {
        Console.setTitle("Sujet3");
        boolean flag = false;
        boolean flag1 = false;
        int j = 0;
        Jeu jeu = new Jeu();
        Case acase[][] = generationPlateau();
        EcranGraphique.init(50, 50, 600, 560, 560, 480, "Puissance 4");
        EcranGraphique.setClearColor(20, 20, 200);
        EcranGraphique.setColor(255, 0, 0);
        EcranGraphique.clear();
        affichagePlateau(acase, jeu);
        EcranGraphique.flush();
        int i = resultatMenuPrincipal();
        do
        {
            if(i == 0 || flag || jeu.nbPions == 42)
            {
                break;
            }
            if(i != 0)
            {
                if(!flag1)
                {
                    configurerJeu(jeu);
                    affichagePlateau(acase, jeu);
                    flag1 = true;
                    j = -1;
                } else
                {
                    flag = gererJoueur(i - 1, j, jeu, acase);
                }
            }
            j = (j + 1) % 2;
            if(!flag)
            {
                i = resultatMenuJeu(jeu);
            }
        } while(true);
        affichagePlateau(acase, jeu);
        Console.afficherln(new Object[] {
            "Return pour quitter"
        });
        Console.saisirString();
        EcranGraphique.exit();
    }
}
