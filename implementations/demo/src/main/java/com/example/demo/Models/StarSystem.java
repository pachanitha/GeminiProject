package com.example.demo.Models;

import edu.gemini.app.ocs.model.Quadrant;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class StarSystem {
    private int systemID;
    private String systemName;

    private CONSTELLATIONS constellation;

    public static enum CONSTELLATIONS {
        ANDROMEDA("Andromeda", 722.278, Quadrant.QUADRANT.NQ1, 90, 40, 0),
        ANTLIA("Air Pump", 238.901, Quadrant.QUADRANT.SQ2, 45, 90, 0),
        APUS("Bird of Paradise", 206.327, Quadrant.QUADRANT.SQ3, 5, 90, 0),
        AQUARIUS("Water Bearer", 979.854, Quadrant.QUADRANT.SQ4, 65, 90, 0),
        AQUILA("Eagle", 652.473, Quadrant.QUADRANT.NQ4, 90, 75, 0),
        ARA("Altar", 237.057, Quadrant.QUADRANT.SQ3, 25, 90, 0),
        ARIES("Ram", 441.395, Quadrant.QUADRANT.NQ1, 90, 60, 0),
        AURIGA("Charioteer", 657.438, Quadrant.QUADRANT.NQ2, 90, 40, 0),
        BOOTES("Herdsman", 906.831, Quadrant.QUADRANT.NQ3, 90, 50, 0),
        CAELUM("Chisel", 124.865, Quadrant.QUADRANT.SQ1, 40, 90, 0),
        CAMELOPARDALIS("Giraffe", 756.828, Quadrant.QUADRANT.NQ2, 90, 10, 0),
        CANCER("Crab", 505.872, Quadrant.QUADRANT.NQ2, 90, 60, 0),
        CANES_VENATICI("Hunting Dogs", 465.194, Quadrant.QUADRANT.NQ3, 90, 40, 0),
        CANIS_MAJOR("Greater Dog", 380.118, Quadrant.QUADRANT.SQ2, 60, 90, 0),
        CANIS_MINOR("Lesser Dog", 183.367, Quadrant.QUADRANT.NQ2, 90, 75, 0),
        CAPRICORNUS("Sea Goat", 413.947, Quadrant.QUADRANT.SQ4, 60, 90, 0),
        CARINA("Keel", 494.184, Quadrant.QUADRANT.SQ2, 20, 90, 0),
        CASSIOPEIA("Cassiopeia", 598.407, Quadrant.QUADRANT.NQ1, 90, 20, 0),
        CENTAURUS("Centaur", 1060.422, Quadrant.QUADRANT.SQ3, 25, 90, 0),
        CEPHEUS("Cepheus", 587.787, Quadrant.QUADRANT.NQ4, 90, 10, 0),
        CETUS("Whale (or Sea Monster)", 1231.411, Quadrant.QUADRANT.SQ1, 70, 90, 0),
        CHAMAELEON("Chameleon", 131.592, Quadrant.QUADRANT.SQ2, 0, 90, 0),
        CIRCINUS("Compass (drafting tool)", 93.353, Quadrant.QUADRANT.SQ3, 30, 90, 0),
        COLUMBA("Dove", 270.184, Quadrant.QUADRANT.SQ1, 45, 90, 0),
        COMA_BERENICES("Berenice’s Hair", 386.475, Quadrant.QUADRANT.NQ3, 90, 70, 0),
        CORONA_AUSTRALIS("Southern Crown", 127.696, Quadrant.QUADRANT.SQ4, 40, 90, 0),
        CORONA_BOREALIS("Northern Crown", 178.71, Quadrant.QUADRANT.NQ3, 90, 50, 0),
        CORVUS("Crow", 183.801, Quadrant.QUADRANT.SQ3, 60, 90, 0),
        CRATER("Cup", 282.398, Quadrant.QUADRANT.SQ2, 65, 90, 0),
        CRUX("Southern Cross", 68.447, Quadrant.QUADRANT.SQ3, 20, 90, 0),
        CYGNUS("Swan", 803.983, Quadrant.QUADRANT.NQ4, 90, 40, 0),
        DELPHINUS("Dolphin", 188.549, Quadrant.QUADRANT.NQ4, 90, 70, 0),
        DORADO("Dolphinfish", 179.173, Quadrant.QUADRANT.SQ1, 20, 90, 0),
        DRACO("Dragon", 1082.952, Quadrant.QUADRANT.NQ3, 90, 15, 0),
        EQUULEUS("Little Horse (Foal)", 71.641, Quadrant.QUADRANT.NQ4, 90, 80, 0),
        ERIDANUS("Eridanus (river)", 1137.919, Quadrant.QUADRANT.SQ1, 32, 90, 0),
        FORNAX("Furnace", 397.502, Quadrant.QUADRANT.SQ1, 50, 90, 0),
        GEMINI("Twins", 513.761, Quadrant.QUADRANT.NQ2, 90, 60, 0),
        GRUS("Crane", 365.513, Quadrant.QUADRANT.SQ4, 34, 90, 0),
        HERCULES("Hercules", 1225.148, Quadrant.QUADRANT.NQ3, 90, 50, 0),
        HOROLOGIUM("Pendulum Clock", 248.885, Quadrant.QUADRANT.SQ1, 30, 90, 0),
        HYDRA("Hydra", 1302.844, Quadrant.QUADRANT.SQ2, 54, 83, 0),
        HYDRUS("Water Snake", 243.035, Quadrant.QUADRANT.SQ1, 8, 90, 0),
        INDUS("Indian", 294.006, Quadrant.QUADRANT.SQ4, 15, 90, 0),
        LACERTA("Lizard", 200.688, Quadrant.QUADRANT.NQ4, 90, 40, 0),
        LEO("Lion", 946.964, Quadrant.QUADRANT.NQ2, 90, 65, 0),
        LEO_MINOR("Lesser Lion", 231.956, Quadrant.QUADRANT.NQ2, 90, 45, 0),
        LEPUS("Hare", 290.291, Quadrant.QUADRANT.SQ1, 63, 90, 0),
        LIBRA("Scales", 538.052, Quadrant.QUADRANT.SQ3, 65, 90, 0),
        LUPUS("Wolf", 333.683, Quadrant.QUADRANT.SQ3, 35, 90, 0),
        LYNX("Lynx", 545.386, Quadrant.QUADRANT.NQ2, 90, 55, 0),
        LYRA("Lyre", 286.476, Quadrant.QUADRANT.NQ4, 90, 40, 0),
        MENSA("Table Mountain (Mons Mensae)", 153.484, Quadrant.QUADRANT.SQ1, 4, 90, 0),
        MICROSCOPIUM("Microscope", 209.513, Quadrant.QUADRANT.SQ4, 45, 90, 0),
        MONOCEROS("Unicorn", 481.569, Quadrant.QUADRANT.NQ2, 75, 90, 0),
        MUSCA("Fly", 138.355, Quadrant.QUADRANT.SQ3, 10, 90, 0),
        NORMA("Level", 165.29, Quadrant.QUADRANT.SQ3, 30, 90, 0),
        OCTANS("Octant", 291.045, Quadrant.QUADRANT.SQ4, 0, 90, 0),
        OPHIUCHUS("Serpent Bearer", 948.34, Quadrant.QUADRANT.SQ3, 80, 80, 0),
        ORION("Orion (the Hunter)", 594.12, Quadrant.QUADRANT.NQ1, 85, 75, 0),
        PAVO("Peacock", 377.666, Quadrant.QUADRANT.SQ4, 30, 90, 0),
        PEGASUS("Pegasus", 1120.794, Quadrant.QUADRANT.NQ4, 90, 60, 0),
        PERSEUS("Perseus", 614.997, Quadrant.QUADRANT.NQ1, 90, 35, 0),
        PHOENIX("Phoenix", 469.319, Quadrant.QUADRANT.SQ1, 32, 80, 0),
        PICTOR("Easel", 246.739, Quadrant.QUADRANT.SQ1, 26, 90, 0),
        PISCES("Fishes", 889.417, Quadrant.QUADRANT.NQ1, 90, 65, 0),
        PISCIS_AUSTRINUS("Southern Fish", 245.375, Quadrant.QUADRANT.SQ4, 55, 90, 0),
        PUPPIS("Stern", 673.434, Quadrant.QUADRANT.SQ2, 40, 90, 0),
        PYXIS("Compass (mariner’s compass)", 220.833, Quadrant.QUADRANT.SQ2, 50, 90, 0),
        RETICULUM("Reticle", 113.936, Quadrant.QUADRANT.SQ1, 23, 90, 0),
        SAGITTA("Arrow", 79.932, Quadrant.QUADRANT.NQ4, 90, 70, 0),
        SAGITTARIUS("Archer", 867.432, Quadrant.QUADRANT.SQ4, 55, 90, 0),
        SCORPIUS("Scorpion", 496.783, Quadrant.QUADRANT.SQ3, 40, 90, 0),
        SCULPTOR("Sculptor", 474.764, Quadrant.QUADRANT.SQ1, 50, 90, 0),
        SCUTUM("Shield (of Sobieski)", 109.114, Quadrant.QUADRANT.SQ4, 80, 90, 0),
        SERPENS("Snake", 636.928, Quadrant.QUADRANT.NQ3, 80, 80, 0),
        SEXTANS("Sextant", 313.515, Quadrant.QUADRANT.SQ2, 80, 90, 0),
        TAURUS("Bull", 797.249, Quadrant.QUADRANT.NQ1, 90, 65, 0),
        TELESCOPIUM("Telescope", 251.512, Quadrant.QUADRANT.SQ4, 40, 90, 0),
        TRIANGULUM("Triangle", 131.847, Quadrant.QUADRANT.NQ1, 90, 60, 0),
        TRIANGULUM_AUSTRAL("Southern Triangle", 109.978, Quadrant.QUADRANT.SQ3, 25, 90, 0),
        TUCANA("Toucan", 294.557, Quadrant.QUADRANT.SQ4, 25, 90, 0),
        URSA_MAJOR("Great Bear", 1279.66, Quadrant.QUADRANT.NQ2, 90, 30, 0),
        URSA_MINOR("Little Bear", 255.864, Quadrant.QUADRANT.NQ3, 90, 10, 0),
        VELA("Sails", 499.649, Quadrant.QUADRANT.SQ2, 30, 90, 0),
        VIRGO("Virgin (Maiden)", 1294.428, Quadrant.QUADRANT.SQ3, 80, 80, 0),
        VOLANS("Flying Fish", 141.354, Quadrant.QUADRANT.SQ2, 15, 90, 0),
        VULPECULA("Fox", 268.165, Quadrant.QUADRANT.NQ4, 90, 55, 0);

        private final String engName;
        private final double area;
        private final Quadrant.QUADRANT quadrant;
        private final int startingLatitude;
        private final int endingLatitude;
        private final int month;

        CONSTELLATIONS(String engName, double area, Quadrant.QUADRANT quadrant, int startingLatitude, int endingLatitude, int month) {
            this.engName = engName;
            this.area = area;
            this.quadrant = quadrant;
            this.startingLatitude = startingLatitude;
            this.endingLatitude = endingLatitude;
            this.month = month;
        }

        public String getEngName() {
            return engName;
        }

        public double getArea() {
            return area;
        }

        public Quadrant.QUADRANT getQuadrant() {
            return quadrant;
        }

        public int getStartingLatitude() {
            return startingLatitude;
        }

        public int getEndingLatitude() {
            return endingLatitude;
        }

        public int getMonth() {
            return month;
        }
    
    }
}