package org.jf.dexlib2;

import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes3.dex */
public class VersionMap {
    public static final int NO_VERSION = -1;

    public static int mapApiToArtVersion(int i10) {
        if (i10 < 19) {
            return -1;
        }
        switch (i10) {
            case 19:
            case 20:
                return 7;
            case 21:
                return 39;
            case 22:
                return 45;
            case 23:
                return 64;
            case 24:
            case 25:
                return 79;
            case 26:
                return CdexHeaderItem.DEBUG_INFO_BASE;
            case 27:
                return 131;
            case 28:
                return 138;
            case 29:
                return 170;
            default:
                return 178;
        }
    }

    public static int mapApiToDexVersion(int i10) {
        if (i10 <= 23) {
            return 35;
        }
        if (i10 <= 25) {
            return 37;
        }
        return i10 <= 27 ? 38 : 39;
    }

    public static int mapArtVersionToApi(int i10) {
        if (i10 >= 170) {
            return 29;
        }
        if (i10 >= 138) {
            return 28;
        }
        if (i10 >= 131) {
            return 27;
        }
        if (i10 >= 124) {
            return 26;
        }
        if (i10 >= 79) {
            return 24;
        }
        if (i10 >= 64) {
            return 23;
        }
        if (i10 >= 45) {
            return 22;
        }
        return i10 >= 39 ? 21 : 19;
    }

    public static int mapDexVersionToApi(int i10) {
        switch (i10) {
            case 35:
                return 23;
            case 36:
            default:
                return -1;
            case 37:
                return 25;
            case 38:
                return 27;
            case 39:
                return 28;
        }
    }
}
