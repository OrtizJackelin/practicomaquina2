package com.claudis.practicomaquina2.mock;

import com.claudis.practicomaquina2.modelo.Genero;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
public class DatosMock {
    public static List<Genero> obtenerTodos() {
        List<Genero> generos = new ArrayList<>();

        String json = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"nombre\": \"Pop\",\n" +
                "    \"imagen\": \"pop\",\n" +
                "    \"artistas\": [\n" +
                "      {\n" +
                "        \"id\": 2,\n" +
                "        \"nombre\": \"Ariana Grande\",\n" +
                "        \"imagen\": \"ariana\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 3,\n" +
                "            \"nombre\": \"EternalSunshine\",\n" +
                "            \"nombreOriginal\": \"Eternal Sunshine\",\n" +
                "            \"imagen\": \"eternalsunshine\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 4,\n" +
                "                \"nombre\": \"Bye\",\n" +
                "                \"archivo\": \"bye\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 5,\n" +
                "                \"nombre\": \"Dont wanna break up again\",\n" +
                "                \"archivo\": \"dontwannabreakupagain\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 6,\n" +
                "                \"nombre\": \"Eternal sunshine\",\n" +
                "                \"archivo\": \"eternalsunshine\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 7,\n" +
                "                \"nombre\": \"Saturn returns interlude\",\n" +
                "                \"archivo\": \"saturnreturnsinterlude\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 8,\n" +
                "            \"nombre\": \"Myeverything\",\n" +
                "            \"nombreOriginal\": \"My everything\",\n" +
                "            \"imagen\": \"myeverything\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 9,\n" +
                "                \"nombre\": \"Doja cat\",\n" +
                "                \"archivo\": \"dojacat\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 10,\n" +
                "                \"nombre\": \"One last time\",\n" +
                "                \"archivo\": \"onelasttime\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 11,\n" +
                "                \"nombre\": \"Problem\",\n" +
                "                \"archivo\": \"problem\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 12,\n" +
                "                \"nombre\": \"Why try\",\n" +
                "                \"archivo\": \"whytry\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 13,\n" +
                "            \"nombre\": \"Positions\",\n" +
                "            \"nombreOriginal\": \"Positions\",\n" +
                "            \"imagen\": \"positions\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 14,\n" +
                "                \"nombre\": \"Just like magic\",\n" +
                "                \"archivo\": \"justlikemagic\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 15,\n" +
                "                \"nombre\": \"Safety\",\n" +
                "                \"archivo\": \"safety\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 16,\n" +
                "                \"nombre\": \"Six thirty\",\n" +
                "                \"archivo\": \"sixthirty\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 17,\n" +
                "                \"nombre\": \"The weekend off the table\",\n" +
                "                \"archivo\": \"theweekndoffthetable\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 18,\n" +
                "            \"nombre\": \"thankunext\",\n" +
                "            \"nombreOriginal\": \"thank u, next\",\n" +
                "            \"imagen\": \"thankunext\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 19,\n" +
                "                \"nombre\": \"Blood line\",\n" +
                "                \"archivo\": \"bloodline\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 20,\n" +
                "                \"nombre\": \"Imagine\",\n" +
                "                \"archivo\": \"imagine\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 21,\n" +
                "                \"nombre\": \"Nasa\",\n" +
                "                \"archivo\": \"nasa\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 22,\n" +
                "                \"nombre\": \"Needy\",\n" +
                "                \"archivo\": \"needy\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 23,\n" +
                "        \"nombre\": \"Bruno Mars\",\n" +
                "        \"imagen\": \"brunomars\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 24,\n" +
                "            \"nombre\": \"24kmagic\",\n" +
                "            \"nombreOriginal\": \"24k magic\",\n" +
                "            \"imagen\": \"magic\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 25,\n" +
                "                \"nombre\": \"Call in gall my\",\n" +
                "                \"archivo\": \"callingallmy\"\n" +
                "              },\n" +
                "               {\n" +
                                    "\"id\": 400,\n" +
                                    "\"nombre\": \"Sun flowers\",\n" +
                                    "\"archivo\": \"sunflowers\"\n" +
                "               },\n" +

                "              {\n" +
                "                \"id\": 26,\n" +
                "                \"nombre\": \"Chunky\",\n" +
                "                \"archivo\": \"chunky\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 27,\n" +
                "                \"nombre\": \"Thats what like\",\n" +
                "                \"archivo\": \"thatswhatlike\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 28,\n" +
                "                \"nombre\": \"Versace on the\",\n" +
                "                \"archivo\": \"versaceonthe\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 29,\n" +
                "            \"nombre\": \"DooWopsHooligans\",\n" +
                "            \"nombreOriginal\": \"Doo-Wops\",\n" +
                "            \"imagen\": \"doowops\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 30,\n" +
                "                \"nombre\": \"Grenade\",\n" +
                "                \"archivo\": \"grenade\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 31,\n" +
                "                \"nombre\": \"Just the way\",\n" +
                "                \"archivo\": \"justtheway\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 32,\n" +
                "                \"nombre\": \"Talking to the moon\",\n" +
                "                \"archivo\": \"talkingtothemoon\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 33,\n" +
                "                \"nombre\": \"The lazy song\",\n" +
                "                \"archivo\": \"thelazysong\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 34,\n" +
                "            \"nombre\": \"silksonic\",\n" +
                "            \"nombreOriginal\": \"Silk sonic\",\n" +
                "            \"imagen\": \"silksonic\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 35,\n" +
                "                \"nombre\": \"After last night\",\n" +
                "                \"archivo\": \"afterlastnight\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 36,\n" +
                "                \"nombre\": \"Silksonic\",\n" +
                "                \"archivo\": \"silksonic\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 37,\n" +
                "                \"nombre\": \"Silksonic intro\",\n" +
                "                \"archivo\": \"silksonicintro\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 38,\n" +
                "                \"nombre\": \"Smokin out\",\n" +
                "                \"archivo\": \"smokinout\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 39,\n" +
                "            \"nombre\": \"unorthodoxjukebox\",\n" +
                "            \"nombreOriginal\": \"Unorthodox\",\n" +
                "            \"imagen\": \"unorthodoxjukebox\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 40,\n" +
                "                \"nombre\": \"Gorilla\",\n" +
                "                \"archivo\": \"gorilla\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 41,\n" +
                "                \"nombre\": \"Lockedout\",\n" +
                "                \"archivo\": \"lockedout\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 42,\n" +
                "                \"nombre\": \"Treasure\",\n" +
                "                \"archivo\": \"treasure\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 43,\n" +
                "                \"nombre\": \"Young girls\",\n" +
                "                \"archivo\": \"younggirls\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 44,\n" +
                "        \"nombre\": \"Dua Lipa\",\n" +
                "        \"imagen\": \"dualipa\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 45,\n" +
                "            \"nombre\": \"DuaLipaDeluxe\",\n" +
                "            \"nombreOriginal\": \"Dua Lipa Deluxe\",\n" +
                "            \"imagen\": \"deluxe\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 46,\n" +
                "                \"nombre\": \"Be the one\",\n" +
                "                \"archivo\": \"betheone\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 47,\n" +
                "                \"nombre\": \"Genesis\",\n" +
                "                \"archivo\": \"genesis\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 48,\n" +
                "                \"nombre\": \"Hotter than hell\",\n" +
                "                \"archivo\": \"hotterthanhell\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 49,\n" +
                "                \"nombre\": \"Lost in your light\",\n" +
                "                \"archivo\": \"lostinyourlight\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 50,\n" +
                "            \"nombre\": \"FutureNostalgia\",\n" +
                "            \"nombreOriginal\": \"Future Nostalgia\",\n" +
                "            \"imagen\": \"futurenostalgia\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 51,\n" +
                "                \"nombre\": \"Cool\",\n" +
                "                \"archivo\": \"cool\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 52,\n" +
                "                \"nombre\": \"Dont start now\",\n" +
                "                \"archivo\": \"dontstartnow\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 53,\n" +
                "                \"nombre\": \"Future nostalgia\",\n" +
                "                \"archivo\": \"futurenostalgia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 54,\n" +
                "                \"nombre\": \"Physical\",\n" +
                "                \"archivo\": \"physical\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 55,\n" +
                "            \"nombre\": \"RadicalOptimism\",\n" +
                "            \"nombreOriginal\": \"Radical Optimism\",\n" +
                "            \"imagen\": \"radicaloptimism\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 56,\n" +
                "                \"nombre\": \"End of\",\n" +
                "                \"archivo\": \"endof\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 57,\n" +
                "                \"nombre\": \"Houdini\",\n" +
                "                \"archivo\": \"houdini\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 58,\n" +
                "                \"nombre\": \"These walls\",\n" +
                "                \"archivo\": \"thesewalls\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 59,\n" +
                "                \"nombre\": \"Training season\",\n" +
                "                \"archivo\": \"trainingseason\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 60,\n" +
                "            \"nombre\": \"TheOnlyEP\",\n" +
                "            \"nombreOriginal\": \"The Only (EP)\",\n" +
                "            \"imagen\": \"theonly\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 61,\n" +
                "                \"nombre\": \"Be the one\",\n" +
                "                \"archivo\": \"betheone\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 62,\n" +
                "                \"nombre\": \"Blow your mind\",\n" +
                "                \"archivo\": \"blowyourmind\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 63,\n" +
                "                \"nombre\": \"For Julian\",\n" +
                "                \"archivo\": \"forjulian\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 64,\n" +
                "                \"nombre\": \"Hotter than hell\",\n" +
                "                \"archivo\": \"hotterthanhell\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 65,\n" +
                "        \"nombre\": \"Michael Jackson\",\n" +
                "        \"imagen\": \"michaeljackson\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 66,\n" +
                "            \"nombre\": \"Bad\",\n" +
                "            \"nombreOriginal\": \"Bad\",\n" +
                "            \"imagen\": \"bad\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 67,\n" +
                "                \"nombre\": \"Bad\",\n" +
                "                \"archivo\": \"bad\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 68,\n" +
                "                \"nombre\": \"Liberian\",\n" +
                "                \"archivo\": \"liberian\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 69,\n" +
                "                \"nombre\": \"Speed\",\n" +
                "                \"archivo\": \"speed\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 70,\n" +
                "                \"nombre\": \"The way\",\n" +
                "                \"archivo\": \"theway\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 71,\n" +
                "            \"nombre\": \"Dangerous\",\n" +
                "            \"nombreOriginal\": \"Dangerous\",\n" +
                "            \"imagen\": \"dangerous\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 72,\n" +
                "                \"nombre\": \"In the closet\",\n" +
                "                \"archivo\": \"inthecloset\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 73,\n" +
                "                \"nombre\": \"Jam\",\n" +
                "                \"archivo\": \"jam\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 74,\n" +
                "                \"nombre\": \"She drives\",\n" +
                "                \"archivo\": \"shedrives\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 75,\n" +
                "                \"nombre\": \"Why you\",\n" +
                "                \"archivo\": \"whyyou\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 76,\n" +
                "            \"nombre\": \"Invincible\",\n" +
                "            \"nombreOriginal\": \"Invincible\",\n" +
                "            \"imagen\": \"invincible\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 77,\n" +
                "                \"nombre\": \"Break\",\n" +
                "                \"archivo\": \"breakmp3\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 78,\n" +
                "                \"nombre\": \"Heart\",\n" +
                "                \"archivo\": \"heart\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 79,\n" +
                "                \"nombre\": \"Invincible\",\n" +
                "                \"archivo\": \"invincible\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 80,\n" +
                "                \"nombre\": \"Unbreakable\",\n" +
                "                \"archivo\": \"unbreakable\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 81,\n" +
                "            \"nombre\": \"Offthewall\",\n" +
                "            \"nombreOriginal\": \"Off the wall\",\n" +
                "            \"imagen\": \"offthewall\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 82,\n" +
                "                \"nombre\": \"Dont stop\",\n" +
                "                \"archivo\": \"dontstop\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 83,\n" +
                "                \"nombre\": \"Geton\",\n" +
                "                \"archivo\": \"geton\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 84,\n" +
                "                \"nombre\": \"Rock\",\n" +
                "                \"archivo\": \"rock\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 85,\n" +
                "                \"nombre\": \"Workin\",\n" +
                "                \"archivo\": \"workin\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 88,\n" +
                "    \"nombre\": \"Reggae\",\n" +
                "    \"imagen\": \"reggae\",\n" +
                "    \"artistas\": [\n" +
                "      {\n" +
                "        \"id\": 89,\n" +
                "        \"nombre\": \"Cultura Profética\",\n" +
                "        \"imagen\": \"culturaprofetica\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 90,\n" +
                "            \"nombre\": \"Diario\",\n" +
                "            \"nombreOriginal\": \"Diario\",\n" +
                "            \"imagen\": \"diario\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 91,\n" +
                "                \"nombre\": \"Árboles\",\n" +
                "                \"archivo\": \"arboles\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 92,\n" +
                "                \"nombre\": \"Boriken\",\n" +
                "                \"archivo\": \"boriken\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 93,\n" +
                "                \"nombre\": \"La fibra\",\n" +
                "                \"archivo\": \"lafibra\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 94,\n" +
                "                \"nombre\": \"Lo que somos\",\n" +
                "                \"archivo\": \"loquesomos\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 95,\n" +
                "            \"nombre\": \"ladulzura\",\n" +
                "            \"nombreOriginal\": \"La dulzura\",\n" +
                "            \"imagen\": \"ladulzura\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 96,\n" +
                "                \"nombre\": \"Baja la tensión\",\n" +
                "                \"archivo\": \"bajalatension\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 97,\n" +
                "                \"nombre\": \"Ilegal\",\n" +
                "                \"archivo\": \"ilegal\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 98,\n" +
                "                \"nombre\": \"La complicidad\",\n" +
                "                \"archivo\": \"lacomplicidad\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 99,\n" +
                "                \"nombre\": \"Rimas\",\n" +
                "                \"archivo\": \"rimas\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 100,\n" +
                "            \"nombre\": \"MOTA\",\n" +
                "            \"nombreOriginal\": \"M.O.T.A\",\n" +
                "            \"imagen\": \"mota\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 101,\n" +
                "                \"nombre\": \"Desde mi silla\",\n" +
                "                \"archivo\": \"desdemisilla\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 102,\n" +
                "                \"nombre\": \"La noche\",\n" +
                "                \"archivo\": \"lanoche\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 103,\n" +
                "                \"nombre\": \"Momento de ocio\",\n" +
                "                \"archivo\": \"momentodeocio\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 104,\n" +
                "                \"nombre\": \"Sub el humo\",\n" +
                "                \"archivo\": \"subelhumo\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 105,\n" +
                "            \"nombre\": \"Sobrevolando\",\n" +
                "            \"nombreOriginal\": \"Sobrevolando\",\n" +
                "            \"imagen\": \"sobrevolando\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 106,\n" +
                "                \"nombre\": \"Despertador\",\n" +
                "                \"archivo\": \"despertador\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 107,\n" +
                "                \"nombre\": \"Efecto dominó\",\n" +
                "                \"archivo\": \"efectodomino\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 108,\n" +
                "                \"nombre\": \"La fibra humana\",\n" +
                "                \"archivo\": \"lafibrahumana\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 109,\n" +
                "                \"nombre\": \"Sobrevolando\",\n" +
                "                \"archivo\": \"sobrevolando\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 110,\n" +
                "        \"nombre\": \"Dread mar I\",\n" +
                "        \"imagen\": \"dreadmari\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 111,\n" +
                "            \"nombre\": \"Amores\",\n" +
                "            \"nombreOriginal\": \"Amor-es\",\n" +
                "            \"imagen\": \"amores\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 112,\n" +
                "                \"nombre\": \"My lord\",\n" +
                "                \"archivo\": \"mylord\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 113,\n" +
                "                \"nombre\": \"Nena\",\n" +
                "                \"archivo\": \"nena\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 114,\n" +
                "                \"nombre\": \"Rayo de sol\",\n" +
                "                \"archivo\": \"rayodesol\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 115,\n" +
                "                \"nombre\": \"Verias que el amor\",\n" +
                "                \"archivo\": \"veriasqueelamor\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 116,\n" +
                "            \"nombre\": \"Caminarascaminos\",\n" +
                "            \"nombreOriginal\": \"Caminaras caminos\",\n" +
                "            \"imagen\": \"caminarascaminos\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 117,\n" +
                "                \"nombre\": \"El brillo de los dos\",\n" +
                "                \"archivo\": \"elbrillodelosdos\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 118,\n" +
                "                \"nombre\": \"Quema\",\n" +
                "                \"archivo\": \"quema\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 119,\n" +
                "                \"nombre\": \"Reconozco\",\n" +
                "                \"archivo\": \"reconozco\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 120,\n" +
                "                \"nombre\": \"Vuela alto\",\n" +
                "                \"archivo\": \"vuelaalto\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 121,\n" +
                "            \"nombre\": \"Enelsendero\",\n" +
                "            \"nombreOriginal\": \"En el sendero\",\n" +
                "            \"imagen\": \"enelsendero\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 122,\n" +
                "                \"nombre\": \"Esquivando\",\n" +
                "                \"archivo\": \"esquivando\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 123,\n" +
                "                \"nombre\": \"Están planeando\",\n" +
                "                \"archivo\": \"estanplaneando\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 124,\n" +
                "                \"nombre\": \"Nadie dijo\",\n" +
                "                \"archivo\": \"nadiedijo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 125,\n" +
                "                \"nombre\": \"Qué hago yo\",\n" +
                "                \"archivo\": \"quehagoyo\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 126,\n" +
                "            \"nombre\": \"Viviendo\",\n" +
                "            \"nombreOriginal\": \"Vivi-en-do\",\n" +
                "            \"imagen\": \"viviendo\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 127,\n" +
                "                \"nombre\": \"Árbol sin hojas\",\n" +
                "                \"archivo\": \"arbolsonhojas\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 128,\n" +
                "                \"nombre\": \"Cómo\",\n" +
                "                \"archivo\": \"como\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 129,\n" +
                "                \"nombre\": \"Me gusta\",\n" +
                "                \"archivo\": \"megusta\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 130,\n" +
                "                \"nombre\": \"Tú sin mi\",\n" +
                "                \"archivo\": \"tusinmi\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 131,\n" +
                "        \"nombre\": \"Los Pericos\",\n" +
                "        \"imagen\": \"lospericos\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 132,\n" +
                "            \"nombre\": \"discoelritualdelabanana80s\",\n" +
                "            \"nombreOriginal\": \"La banana\",\n" +
                "            \"imagen\": \"labanana\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 133,\n" +
                "                \"nombre\": \"Halei\",\n" +
                "                \"archivo\": \"halei\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 134,\n" +
                "                \"nombre\": \"La banana\",\n" +
                "                \"archivo\": \"labanana\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 135,\n" +
                "                \"nombre\": \"Movida\",\n" +
                "                \"archivo\": \"movida\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 136,\n" +
                "                \"nombre\": \"Nada que perder\",\n" +
                "                \"archivo\": \"nadaqueperder\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 137,\n" +
                "            \"nombre\": \"PericosFriends\",\n" +
                "            \"nombreOriginal\": \"Pericos & Friends\",\n" +
                "            \"imagen\": \"pericosyfriends\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 138,\n" +
                "                \"nombre\": \"Mucha experiencia\",\n" +
                "                \"archivo\": \"muchaexperiencia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 139,\n" +
                "                \"nombre\": \"Pupilas lejanas\",\n" +
                "                \"archivo\": \"pupilaslejanas\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 140,\n" +
                "                \"nombre\": \"Runaway\",\n" +
                "                \"archivo\": \"runaway\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 141,\n" +
                "                \"nombre\": \"Waiting\",\n" +
                "                \"archivo\": \"waitin\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 142,\n" +
                "            \"nombre\": \"Vivapericos\",\n" +
                "            \"nombreOriginal\": \"Viva pericos!\",\n" +
                "            \"imagen\": \"vivapericos\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 143,\n" +
                "                \"nombre\": \"La distancia\",\n" +
                "                \"archivo\": \"ladistancia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 144,\n" +
                "                \"nombre\": \"Lágrimas negras\",\n" +
                "                \"archivo\": \"lagrimasnegras\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 145,\n" +
                "                \"nombre\": \"Tú carcel\",\n" +
                "                \"archivo\": \"tucarcel\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 146,\n" +
                "                \"nombre\": \"Vete ya\",\n" +
                "                \"archivo\": \"veteya\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 147,\n" +
                "            \"nombre\": \"Yerbabuena\",\n" +
                "            \"nombreOriginal\": \"Yerba buena\",\n" +
                "            \"imagen\": \"yerbabuena\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 148,\n" +
                "                \"nombre\": \"Como un gavilán\",\n" +
                "                \"archivo\": \"comoungavilan\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 149,\n" +
                "                \"nombre\": \"Por una cabeza\",\n" +
                "                \"archivo\": \"porunacabeza\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 150,\n" +
                "                \"nombre\": \"Recuérdame\",\n" +
                "                \"archivo\": \"recuerdame\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 151,\n" +
                "                \"nombre\": \"Salmo\",\n" +
                "                \"archivo\": \"salmo\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 152,\n" +
                "        \"nombre\": \"Rawayana\",\n" +
                "        \"imagen\": \"rawayana\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 153,\n" +
                "            \"nombre\": \"Cuandolosacfalospredominan\",\n" +
                "            \"nombreOriginal\": \"Los Acéfalos\",\n" +
                "            \"imagen\": \"cuandolosacefalos\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 154,\n" +
                "                \"nombre\": \"Discúlpeme\",\n" +
                "                \"archivo\": \"disculpeme\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 155,\n" +
                "                \"nombre\": \"En tu mar\",\n" +
                "                \"archivo\": \"entumar\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 156,\n" +
                "                \"nombre\": \"f350\",\n" +
                "                \"archivo\": \"f350\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 157,\n" +
                "                \"nombre\": \"Mi amigo Luis\",\n" +
                "                \"archivo\": \"miamigoluis\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 158,\n" +
                "            \"nombre\": \"Licenciaparaserlibre\",\n" +
                "            \"nombreOriginal\": \"Licencia\",\n" +
                "            \"imagen\": \"licenciaparaserlibre\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 159,\n" +
                "                \"nombre\": \"Algo distinto\",\n" +
                "                \"archivo\": \"algodistinto\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 160,\n" +
                "                \"nombre\": \"Falta poco\",\n" +
                "                \"archivo\": \"faltapoco\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 161,\n" +
                "                \"nombre\": \"Fuego azúl\",\n" +
                "                \"archivo\": \"fuegoazul\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 162,\n" +
                "                \"nombre\": \"La betonada\",\n" +
                "                \"archivo\": \"labetonada\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 163,\n" +
                "            \"nombre\": \"Rawayanaland\",\n" +
                "            \"nombreOriginal\": \"Rawayanaland\",\n" +
                "            \"imagen\": \"rawayanaland\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 164,\n" +
                "                \"nombre\": \"Ay ay\",\n" +
                "                \"archivo\": \"ayay\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 165,\n" +
                "                \"nombre\": \"No significa\",\n" +
                "                \"archivo\": \"nosignifica\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 166,\n" +
                "                \"nombre\": \"Si lo uso\",\n" +
                "                \"archivo\": \"silouso\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 167,\n" +
                "                \"nombre\": \"Vocabulario\",\n" +
                "                \"archivo\": \"vocabulario\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 168,\n" +
                "            \"nombre\": \"Quientraelascornetas\",\n" +
                "            \"nombreOriginal\": \"Las Cornetas\",\n" +
                "            \"imagen\": \"quientraelascornetas\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 169,\n" +
                "                \"nombre\": \"besos ricos\",\n" +
                "                \"archivo\": \"besosricos\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 170,\n" +
                "                \"nombre\": \"Bikini\",\n" +
                "                \"archivo\": \"binikini\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 171,\n" +
                "                \"nombre\": \"Dame un break\",\n" +
                "                \"archivo\": \"dameunbreak\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 172,\n" +
                "                \"nombre\": \"Nada malo\",\n" +
                "                \"archivo\": \"nadamalo\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 173,\n" +
                "    \"nombre\": \"Rock and Roll\",\n" +
                "    \"imagen\": \"rockandroll\",\n" +
                "    \"artistas\": [\n" +
                "      {\n" +
                "        \"id\": 174,\n" +
                "        \"nombre\": \"Andrés Calamaro\",\n" +
                "        \"imagen\": \"andrescalamaro\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 175,\n" +
                "            \"nombre\": \"AltaSuciedad\",\n" +
                "            \"nombreOriginal\": \"Alta Suciedad\",\n" +
                "            \"imagen\": \"altasuciedad\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 176,\n" +
                "                \"nombre\": \"Alta suciedad\",\n" +
                "                \"archivo\": \"altasuciedad\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 177,\n" +
                "                \"nombre\": \"Donde manda marinero\",\n" +
                "                \"archivo\": \"dondemandamarinero\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 178,\n" +
                "                \"nombre\": \"Loco\",\n" +
                "                \"archivo\": \"loco\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 179,\n" +
                "                \"nombre\": \"Todo lo demás\",\n" +
                "                \"archivo\": \"todolodemas\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 180,\n" +
                "            \"nombre\": \"Bohemio\",\n" +
                "            \"nombreOriginal\": \"Bohemio\",\n" +
                "            \"imagen\": \"bohemio\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 181,\n" +
                "                \"nombre\": \"Bohemio\",\n" +
                "                \"archivo\": \"bohemio\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 182,\n" +
                "                \"nombre\": \"Cuando no estas\",\n" +
                "                \"archivo\": \"cuandonoestas\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 183,\n" +
                "                \"nombre\": \"Rehenes\",\n" +
                "                \"archivo\": \"rehenes\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 184,\n" +
                "                \"nombre\": \"Tantas veces\",\n" +
                "                \"archivo\": \"tantasveces\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 185,\n" +
                "            \"nombre\": \"Elregreso\",\n" +
                "            \"nombreOriginal\": \"El regreso\",\n" +
                "            \"imagen\": \"elregreso\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 186,\n" +
                "                \"nombre\": \"El cantante\",\n" +
                "                \"archivo\": \"elcantante\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 187,\n" +
                "                \"nombre\": \"El salmón\",\n" +
                "                \"archivo\": \"elsalmon\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 188,\n" +
                "                \"nombre\": \"Te quiero igual\",\n" +
                "                \"archivo\": \"tequieroigual\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 189,\n" +
                "                \"nombre\": \"Tuyo siempre\",\n" +
                "                \"archivo\": \"tuyosiempre\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 190,\n" +
                "            \"nombre\": \"HonestidadBrutal\",\n" +
                "            \"nombreOriginal\": \"Honestidad Brutal\",\n" +
                "            \"imagen\": \"honestidadbrutal\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 191,\n" +
                "                \"nombre\": \"Clonazepan\",\n" +
                "                \"archivo\": \"clonazepan\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 192,\n" +
                "                \"nombre\": \"El día de la mujer\",\n" +
                "                \"archivo\": \"eldiadelamujer\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 193,\n" +
                "                \"nombre\": \"La parte de adelante\",\n" +
                "                \"archivo\": \"lapartedeadelante\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 194,\n" +
                "                \"nombre\": \"Te quiero igual\",\n" +
                "                \"archivo\": \"tequieroigual\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 195,\n" +
                "        \"nombre\": \"Charly García\",\n" +
                "        \"imagen\": \"charlygarcia\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 196,\n" +
                "            \"nombre\": \"Comoconseguirchicas\",\n" +
                "            \"nombreOriginal\": \"Chicas\",\n" +
                "            \"imagen\": \"comoconseguirchicas\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 197,\n" +
                "                \"nombre\": \"Ella es bailarina\",\n" +
                "                \"archivo\": \"ellaesbailarina\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 198,\n" +
                "                \"nombre\": \"Fanky\",\n" +
                "                \"archivo\": \"fanky\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 199,\n" +
                "                \"nombre\": \"No toquen\",\n" +
                "                \"archivo\": \"notoquen\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 200,\n" +
                "                \"nombre\": \"Zocacola\",\n" +
                "                \"archivo\": \"zocacola\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 201,\n" +
                "            \"nombre\": \"Filosofabaratayzapatosdegoma\",\n" +
                "            \"nombreOriginal\": \"Filosofía barata\",\n" +
                "            \"imagen\": \"filosofiabarata\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 202,\n" +
                "                \"nombre\": \"Curitas\",\n" +
                "                \"archivo\": \"curitas\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 203,\n" +
                "                \"nombre\": \"Gato de metal\",\n" +
                "                \"archivo\": \"gatodemetal\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 204,\n" +
                "                \"nombre\": \"No te mueras\",\n" +
                "                \"archivo\": \"notemueras\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 205,\n" +
                "                \"nombre\": \"Reloj\",\n" +
                "                \"archivo\": \"reloj\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 206,\n" +
                "            \"nombre\": \"Partedelareligion\",\n" +
                "            \"nombreOriginal\": \"Religión\",\n" +
                "            \"imagen\": \"partedelareligion\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 207,\n" +
                "                \"nombre\": \"Buscando un símbolo\",\n" +
                "                \"archivo\": \"buscandounsimbolo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 208,\n" +
                "                \"nombre\": \"Necesito tu amor\",\n" +
                "                \"archivo\": \"necesitotuamor\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 209,\n" +
                "                \"nombre\": \"Parte de la religión\",\n" +
                "                \"archivo\": \"partedelareligion\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 210,\n" +
                "                \"nombre\": \"Rap de las hormigas\",\n" +
                "                \"archivo\": \"rapdelashormigas\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 211,\n" +
                "            \"nombre\": \"Yendodelacamaalliving\",\n" +
                "            \"nombreOriginal\": \"Al living\",\n" +
                "            \"imagen\": \"yendodelacamaalliving\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 212,\n" +
                "                \"nombre\": \"Buenos Aires\",\n" +
                "                \"archivo\": \"buenosaires\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 213,\n" +
                "                \"nombre\": \"Super héroes\",\n" +
                "                \"archivo\": \"superheroes\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 214,\n" +
                "                \"nombre\": \"Vos también\",\n" +
                "                \"archivo\": \"vostambien\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 215,\n" +
                "                \"nombre\": \"Yendo de la cama\",\n" +
                "                \"archivo\": \"yendodelacama\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 216,\n" +
                "        \"nombre\": \"Elvis Presley\",\n" +
                "        \"imagen\": \"elvispresley\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 217,\n" +
                "            \"nombre\": \"301hits\",\n" +
                "            \"nombreOriginal\": \"30 #1 hits\",\n" +
                "            \"imagen\": \"hits\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 218,\n" +
                "                \"nombre\": \"Dont be cruel\",\n" +
                "                \"archivo\": \"dontbecruel\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 219,\n" +
                "                \"nombre\": \"Heart break\",\n" +
                "                \"archivo\": \"heartbreak\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 220,\n" +
                "                \"nombre\": \"Hound dog\",\n" +
                "                \"archivo\": \"hounddog\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 221,\n" +
                "                \"nombre\": \"Love me tender\",\n" +
                "                \"archivo\": \"lovemetender\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 222,\n" +
                "            \"nombre\": \"Elvisisback\",\n" +
                "            \"nombreOriginal\": \"Elvis is back!\",\n" +
                "            \"imagen\": \"elvisisback\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 223,\n" +
                "                \"nombre\": \"Fever\",\n" +
                "                \"archivo\": \"fever\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 224,\n" +
                "                \"nombre\": \"I will\",\n" +
                "                \"archivo\": \"iwill\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 225,\n" +
                "                \"nombre\": \"Make me\",\n" +
                "                \"archivo\": \"makeme\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 226,\n" +
                "                \"nombre\": \"The girl\",\n" +
                "                \"archivo\": \"thegirl\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 227,\n" +
                "            \"nombre\": \"ElvisPresley\",\n" +
                "            \"nombreOriginal\": \"Elvis Presley\",\n" +
                "            \"imagen\": \"elvispresley\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 228,\n" +
                "                \"nombre\": \"Blue\",\n" +
                "                \"archivo\": \"blue\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 229,\n" +
                "                \"nombre\": \"I got\",\n" +
                "                \"archivo\": \"igot\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 230,\n" +
                "                \"nombre\": \"Im\",\n" +
                "                \"archivo\": \"im\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 231,\n" +
                "                \"nombre\": \"One\",\n" +
                "                \"archivo\": \"one\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 232,\n" +
                "            \"nombre\": \"WalkAMileInMyShoes\",\n" +
                "            \"nombreOriginal\": \"Walk A Mile\",\n" +
                "            \"imagen\": \"walkamile\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 233,\n" +
                "                \"nombre\": \"Ive lost\",\n" +
                "                \"archivo\": \"ivelost\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 234,\n" +
                "                \"nombre\": \"The next\",\n" +
                "                \"archivo\": \"thenext\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 235,\n" +
                "                \"nombre\": \"The wonder\",\n" +
                "                \"archivo\": \"thewonder\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 236,\n" +
                "                \"nombre\": \"You dont have\",\n" +
                "                \"archivo\": \"youdonthave\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 237,\n" +
                "        \"nombre\": \"The Beatles\",\n" +
                "        \"imagen\": \"thebeatles\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 238,\n" +
                "            \"nombre\": \"abbeyroad\",\n" +
                "            \"nombreOriginal\": \"abbey road\",\n" +
                "            \"imagen\": \"abbeyroad\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 239,\n" +
                "                \"nombre\": \"Come together\",\n" +
                "                \"archivo\": \"cometogether\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 240,\n" +
                "                \"nombre\": \"Maxwell\",\n" +
                "                \"archivo\": \"maxwell\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 241,\n" +
                "                \"nombre\": \"Oh darling\",\n" +
                "                \"archivo\": \"ohdarling\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 242,\n" +
                "                \"nombre\": \"Something\",\n" +
                "                \"archivo\": \"something\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 243,\n" +
                "            \"nombre\": \"Beatlesforsale\",\n" +
                "            \"nombreOriginal\": \"Beatles for sale\",\n" +
                "            \"imagen\": \"beatlesforsale\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 244,\n" +
                "                \"nombre\": \"Babys\",\n" +
                "                \"archivo\": \"babys\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 245,\n" +
                "                \"nombre\": \"Im a loser\",\n" +
                "                \"archivo\": \"imaloser\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 246,\n" +
                "                \"nombre\": \"No reply\",\n" +
                "                \"archivo\": \"noreply\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 247,\n" +
                "                \"nombre\": \"Rock and roll\",\n" +
                "                \"archivo\": \"rockandroll\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 248,\n" +
                "            \"nombre\": \"help\",\n" +
                "            \"nombreOriginal\": \"help\",\n" +
                "            \"imagen\": \"help\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 249,\n" +
                "                \"nombre\": \"Help\",\n" +
                "                \"archivo\": \"help\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 250,\n" +
                "                \"nombre\": \"I need you\",\n" +
                "                \"archivo\": \"ineedyou\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 251,\n" +
                "                \"nombre\": \"The night\",\n" +
                "                \"archivo\": \"thenight\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 252,\n" +
                "                \"nombre\": \"You ve\",\n" +
                "                \"archivo\": \"youve\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 253,\n" +
                "            \"nombre\": \"Rubbersoul\",\n" +
                "            \"nombreOriginal\": \"Rubber soul\",\n" +
                "            \"imagen\": \"rubbersoul\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 254,\n" +
                "                \"nombre\": \"Drive my car\",\n" +
                "                \"archivo\": \"drivemycar\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 255,\n" +
                "                \"nombre\": \"Norwegian wood\",\n" +
                "                \"archivo\": \"norwegianwood\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 256,\n" +
                "                \"nombre\": \"Now here\",\n" +
                "                \"archivo\": \"nowhere\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 257,\n" +
                "                \"nombre\": \"You eont\",\n" +
                "                \"archivo\": \"youeont\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 258,\n" +
                "    \"nombre\": \"Salsa\",\n" +
                "    \"imagen\": \"logosalsa\",\n" +
                "    \"artistas\": [\n" +
                "      {\n" +
                "        \"id\": 259,\n" +
                "        \"nombre\": \"Eddie Santiago\",\n" +
                "        \"imagen\": \"eddiesantiago\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 260,\n" +
                "            \"nombre\": \"Devueltaacasa\",\n" +
                "            \"nombreOriginal\": \"De vuelta\",\n" +
                "            \"imagen\": \"devueltacasa\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 261,\n" +
                "                \"nombre\": \"Me vuelve loco\",\n" +
                "                \"archivo\": \"mevuelveloco\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 262,\n" +
                "                \"nombre\": \"Quiero saber\",\n" +
                "                \"archivo\": \"quierosaber\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 263,\n" +
                "                \"nombre\": \"Un si del alma\",\n" +
                "                \"archivo\": \"unsidelalma\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 264,\n" +
                "                \"nombre\": \"Y ya no aguanto\",\n" +
                "                \"archivo\": \"yyanoaguanto\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 265,\n" +
                "            \"nombre\": \"Despuesdelsilencio\",\n" +
                "            \"nombreOriginal\": \"Silencio\",\n" +
                "            \"imagen\": \"despuesdelsilencio\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 266,\n" +
                "                \"nombre\": \"Falsa\",\n" +
                "                \"archivo\": \"falsa\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 267,\n" +
                "                \"nombre\": \"Loco por tu amor\",\n" +
                "                \"archivo\": \"locoportuamor\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 268,\n" +
                "                \"nombre\": \"No me hables mal de ella\",\n" +
                "                \"archivo\": \"nomehablesmaldeella\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 269,\n" +
                "                \"nombre\": \"Que duro\",\n" +
                "                \"archivo\": \"queduro\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 270,\n" +
                "            \"nombre\": \"Invasionalaprivacidad\",\n" +
                "            \"nombreOriginal\": \"Privacidad\",\n" +
                "            \"imagen\": \"invasionalaprivacidad\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 271,\n" +
                "                \"nombre\": \"Amor de\",\n" +
                "                \"archivo\": \"amorde\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 272,\n" +
                "                \"nombre\": \"Antidoto y veneno\",\n" +
                "                \"archivo\": \"antidotoyveneno\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 273,\n" +
                "                \"nombre\": \"Mía\",\n" +
                "                \"archivo\": \"mia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 274,\n" +
                "                \"nombre\": \"Tú me haces falta\",\n" +
                "                \"archivo\": \"tumehacesfalta\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 275,\n" +
                "            \"nombre\": \"Lluviabailetotal\",\n" +
                "            \"nombreOriginal\": \"Lluvia\",\n" +
                "            \"imagen\": \"lluvia\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 276,\n" +
                "                \"nombre\": \"Lluvia\",\n" +
                "                \"archivo\": \"lluvia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 277,\n" +
                "                \"nombre\": \"Mía\",\n" +
                "                \"archivo\": \"mia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 278,\n" +
                "                \"nombre\": \"Que locura\",\n" +
                "                \"archivo\": \"quelocura\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 279,\n" +
                "                \"nombre\": \"Tú me haces falta\",\n" +
                "                \"archivo\": \"tumehacesfalta\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 280,\n" +
                "        \"nombre\": \"Frankie Ruiz\",\n" +
                "        \"imagen\": \"frankieruiz\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 281,\n" +
                "            \"nombre\": \"Cantandolealamor\",\n" +
                "            \"nombreOriginal\": \"Amor\",\n" +
                "            \"imagen\": \"cantandolealamor\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 282,\n" +
                "                \"nombre\": \"Cada uno\",\n" +
                "                \"archivo\": \"cadauno\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 283,\n" +
                "                \"nombre\": \"Imposible amor\",\n" +
                "                \"archivo\": \"imposibleamor\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 284,\n" +
                "                \"nombre\": \"Me dejo\",\n" +
                "                \"archivo\": \"medejo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 285,\n" +
                "                \"nombre\": \"Quiero verte\",\n" +
                "                \"archivo\": \"quieroverte\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 286,\n" +
                "            \"nombre\": \"Cantandolealamorvol2\",\n" +
                "            \"nombreOriginal\": \"Volumen 2\",\n" +
                "            \"imagen\": \"cantandolealamordos\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 287,\n" +
                "                \"nombre\": \"Ironía\",\n" +
                "                \"archivo\": \"ironia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 288,\n" +
                "                \"nombre\": \"Mi libertad\",\n" +
                "                \"archivo\": \"milibertad\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 289,\n" +
                "                \"nombre\": \"Mujer\",\n" +
                "                \"archivo\": \"mujer\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 290,\n" +
                "                \"nombre\": \"Tú con él\",\n" +
                "                \"archivo\": \"tuconel\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 291,\n" +
                "            \"nombre\": \"Feliznavidadconsalsa\",\n" +
                "            \"nombreOriginal\": \"Felíz navidad\",\n" +
                "            \"imagen\": \"feliznavidad\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 292,\n" +
                "                \"nombre\": \"Deseándote\",\n" +
                "                \"archivo\": \"deseandote\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 293,\n" +
                "                \"nombre\": \"Desnudate mujer\",\n" +
                "                \"archivo\": \"desnudatemujer\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 294,\n" +
                "                \"nombre\": \"Ésta cobardía\",\n" +
                "                \"archivo\": \"estacobarda\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 295,\n" +
                "                \"nombre\": \"Tú con él\",\n" +
                "                \"archivo\": \"tuconel\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 296,\n" +
                "            \"nombre\": \"Show\",\n" +
                "            \"nombreOriginal\": \"Show\",\n" +
                "            \"imagen\": \"logoshow\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 297,\n" +
                "                \"nombre\": \"Deseándote\",\n" +
                "                \"archivo\": \"deseandote\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 298,\n" +
                "                \"nombre\": \"Me acostumbre\",\n" +
                "                \"archivo\": \"meacostumbre\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 299,\n" +
                "                \"nombre\": \"Mi libertad\",\n" +
                "                \"archivo\": \"milibertad\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 300,\n" +
                "                \"nombre\": \" Tú con él\",\n" +
                "                \"archivo\": \"tuconel\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 301,\n" +
                "        \"nombre\": \"Los Adolescentes\",\n" +
                "        \"imagen\": \"losadolecentesorquesta\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 302,\n" +
                "            \"nombre\": \"Ahoramasquenunca\",\n" +
                "            \"nombreOriginal\": \"Ahora más\",\n" +
                "            \"imagen\": \"masquenunca\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 303,\n" +
                "                \"nombre\": \"Envidioso\",\n" +
                "                \"archivo\": \"envidioso\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 304,\n" +
                "                \"nombre\": \"Latino\",\n" +
                "                \"archivo\": \"latino\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 305,\n" +
                "                \"nombre\": \"Recuerdos\",\n" +
                "                \"archivo\": \"recuerdos\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 306,\n" +
                "                \"nombre\": \"Virgen\",\n" +
                "                \"archivo\": \"virgen\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 307,\n" +
                "            \"nombre\": \"Búscame\",\n" +
                "            \"nombreOriginal\": \"Búscame\",\n" +
                "            \"imagen\": \"buscame\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 308,\n" +
                "                \"nombre\": \"Cuerpo\",\n" +
                "                \"archivo\": \"cuerpo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 309,\n" +
                "                \"nombre\": \"Ponte pila\",\n" +
                "                \"archivo\": \"pontepila\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 310,\n" +
                "                \"nombre\": \"Se acabó\",\n" +
                "                \"archivo\": \"seacabo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 311,\n" +
                "                \"nombre\": \"Si supieras\",\n" +
                "                \"archivo\": \"sisupieras\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 312,\n" +
                "            \"nombre\": \"Indestructible\",\n" +
                "            \"nombreOriginal\": \"Indestructible\",\n" +
                "            \"imagen\": \"logoindestructibl\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 313,\n" +
                "                \"nombre\": \"Cerre sus ojos\",\n" +
                "                \"archivo\": \"cerresusojos\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 314,\n" +
                "                \"nombre\": \"Se fué\",\n" +
                "                \"archivo\": \"sefue\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 315,\n" +
                "                \"nombre\": \"Tengo un amor\",\n" +
                "                \"archivo\": \"tengounamor\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 316,\n" +
                "                \"nombre\": \"Ya llegué\",\n" +
                "                \"archivo\": \"yallegue\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 317,\n" +
                "            \"nombre\": \"Sellosdemiadn\",\n" +
                "            \"nombreOriginal\": \"Sellos de mi adn\",\n" +
                "            \"imagen\": \"sellosdemiadn\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 318,\n" +
                "                \"nombre\": \"Amiga mía\",\n" +
                "                \"archivo\": \"amigamia\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 319,\n" +
                "                \"nombre\": \"Bailando\",\n" +
                "                \"archivo\": \"bailando\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 320,\n" +
                "                \"nombre\": \"Por amarte\",\n" +
                "                \"archivo\": \"poramarte\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 321,\n" +
                "                \"nombre\": \"Si no me amas\",\n" +
                "                \"archivo\": \"sinomeamas\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 322,\n" +
                "        \"nombre\": \"Willie Colón\",\n" +
                "        \"imagen\": \"williecolon\",\n" +
                "        \"albumes\": [\n" +
                "          {\n" +
                "            \"id\": 323,\n" +
                "            \"nombre\": \"AmorVerdadero\",\n" +
                "            \"nombreOriginal\": \"Amor Verdadero\",\n" +
                "            \"imagen\": \"amorverdadero\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 324,\n" +
                "                \"nombre\": \"Celo\",\n" +
                "                \"archivo\": \"celo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 325,\n" +
                "                \"nombre\": \"Miel\",\n" +
                "                \"archivo\": \"miel\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 326,\n" +
                "                \"nombre\": \"Oh que será\",\n" +
                "                \"archivo\": \"ohquesera\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 327,\n" +
                "                \"nombre\": \"Toma mis manos\",\n" +
                "                \"archivo\": \"tomamismanos\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 328,\n" +
                "            \"nombre\": \"DemasiadoCorazn\",\n" +
                "            \"nombreOriginal\": \"Demasiado Corazón\",\n" +
                "            \"imagen\": \"logodemasiadocorazon\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 329,\n" +
                "                \"nombre\": \"Cayó\",\n" +
                "                \"archivo\": \"cayo\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 330,\n" +
                "                \"nombre\": \"Demasiado\",\n" +
                "                \"archivo\": \"demasiado\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 331,\n" +
                "                \"nombre\": \"Despertares\",\n" +
                "                \"archivo\": \"despertares\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 332,\n" +
                "                \"nombre\": \"Yo sin ti\",\n" +
                "                \"archivo\": \"yosinti\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 333,\n" +
                "            \"nombre\": \"Fantasmas\",\n" +
                "            \"nombreOriginal\": \"Fantasmas\",\n" +
                "            \"imagen\": \"logofantasmaspng\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 334,\n" +
                "                \"nombre\": \"Al dormir\",\n" +
                "                \"archivo\": \"aldormir\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 335,\n" +
                "                \"nombre\": \"Amor verdadero\",\n" +
                "                \"archivo\": \"amorverdadero\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 336,\n" +
                "                \"nombre\": \"Mi sueño\",\n" +
                "                \"archivo\": \"misueno\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 337,\n" +
                "                \"nombre\": \"Toma mis manos\",\n" +
                "                \"archivo\": \"tomamismanos\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"id\": 338,\n" +
                "            \"nombre\": \"TalentodeTelevisin\",\n" +
                "            \"nombreOriginal\": \"Talento de Televisión\",\n" +
                "            \"imagen\": \"talentodetv\",\n" +
                "            \"canciones\": [\n" +
                "              {\n" +
                "                \"id\": 339,\n" +
                "                \"nombre\": \"Blanco luna\",\n" +
                "                \"archivo\": \"blancoluna\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 340,\n" +
                "                \"nombre\": \"Corazón\",\n" +
                "                \"archivo\": \"corazon\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 341,\n" +
                "                \"nombre\": \"Toca madera\",\n" +
                "                \"archivo\": \"tocamadera\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"id\": 342,\n" +
                "                \"nombre\": \"Yo sin ti\",\n" +
                "                \"archivo\": \"yosinti\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";
            ObjectMapper objectMapper = new ObjectMapper();
        try {
            generos = objectMapper.readValue(json, new TypeReference<List<Genero>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return generos;
    }

}
