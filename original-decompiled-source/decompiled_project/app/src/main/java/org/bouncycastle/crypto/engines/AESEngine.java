package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultMultiBlockCipher;
import org.bouncycastle.crypto.MultiBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes2.dex */
public class AESEngine extends DefaultMultiBlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f19943m1 = -2139062144;

    /* renamed from: m2, reason: collision with root package name */
    private static final int f19944m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f19945m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f19946m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f19947m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f19948s;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, RegisterType.REFERENCE, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, RegisterType.UNINIT_REF, -1, -13, -46, -51, 12, RegisterType.CONFLICTED, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, RegisterType.FLOAT, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, RegisterType.DOUBLE_LO, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, RegisterType.UNINIT_THIS, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, RegisterType.LONG_HI, -65, -26, 66, 104, 65, -103, 45, RegisterType.DOUBLE_HI, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, RegisterType.FLOAT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, RegisterType.DOUBLE_HI, 2, -63, -81, -67, 3, 1, RegisterType.CONFLICTED, -118, 107, 58, -111, RegisterType.UNINIT_THIS, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, RegisterType.DOUBLE_LO, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, RegisterType.REFERENCE, RegisterType.UNINIT_REF, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, RegisterType.LONG_HI, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, HeaderItem.DATA_START_OFFSET, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    private static final int[] T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    public AESEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    private static int FFmulX(int i10) {
        return (((i10 & f19943m1) >>> 7) * 27) ^ ((f19944m2 & i10) << 1);
    }

    private static int FFmulX2(int i10) {
        int i11 = (f19947m5 & i10) << 2;
        int i12 = i10 & f19946m4;
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (i11 ^ (i13 >>> 2));
    }

    private int bitsOfSecurity() {
        if (this.WorkingKey == null) {
            return 256;
        }
        return (r0.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i10 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i10 + 12);
        int i12 = this.ROUNDS;
        int[] iArr2 = iArr[i12];
        boolean z10 = false;
        int i13 = iLittleEndianToInt ^ iArr2[0];
        int i14 = 1;
        int i15 = iLittleEndianToInt2 ^ iArr2[1];
        char c10 = 2;
        int i16 = iLittleEndianToInt3 ^ iArr2[2];
        int i17 = i12 - 1;
        char c11 = 3;
        int iShift = iLittleEndianToInt4 ^ iArr2[3];
        while (i17 > i14) {
            int[] iArr3 = Tinv0;
            boolean z11 = z10;
            int i18 = i14;
            int iShift2 = (((iArr3[i13 & 255] ^ shift(iArr3[(iShift >> 8) & 255], 24)) ^ shift(iArr3[(i16 >> 16) & 255], 16)) ^ shift(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i17][z11 ? 1 : 0];
            char c12 = c10;
            int iShift3 = (((iArr3[i15 & 255] ^ shift(iArr3[(i13 >> 8) & 255], 24)) ^ shift(iArr3[(iShift >> 16) & 255], 16)) ^ shift(iArr3[(i16 >> 24) & 255], 8)) ^ iArr[i17][i18];
            char c13 = c11;
            int iShift4 = (((iArr3[i16 & 255] ^ shift(iArr3[(i15 >> 8) & 255], 24)) ^ shift(iArr3[(i13 >> 16) & 255], 16)) ^ shift(iArr3[(iShift >> 24) & 255], 8)) ^ iArr[i17][c12];
            int iShift5 = ((iArr3[iShift & 255] ^ shift(iArr3[(i16 >> 8) & 255], 24)) ^ shift(iArr3[(i15 >> 16) & 255], 16)) ^ shift(iArr3[(i13 >> 24) & 255], 8);
            int i19 = i17 - 1;
            int i20 = iShift5 ^ iArr[i17][c13];
            int iShift6 = (((iArr3[iShift2 & 255] ^ shift(iArr3[(i20 >> 8) & 255], 24)) ^ shift(iArr3[(iShift4 >> 16) & 255], 16)) ^ shift(iArr3[(iShift3 >> 24) & 255], 8)) ^ iArr[i19][z11 ? 1 : 0];
            int iShift7 = (((iArr3[iShift3 & 255] ^ shift(iArr3[(iShift2 >> 8) & 255], 24)) ^ shift(iArr3[(i20 >> 16) & 255], 16)) ^ shift(iArr3[(iShift4 >> 24) & 255], 8)) ^ iArr[i19][i18];
            int iShift8 = (((iArr3[iShift4 & 255] ^ shift(iArr3[(iShift3 >> 8) & 255], 24)) ^ shift(iArr3[(iShift2 >> 16) & 255], 16)) ^ shift(iArr3[(i20 >> 24) & 255], 8)) ^ iArr[i19][c12];
            i17 -= 2;
            iShift = (((iArr3[i20 & 255] ^ shift(iArr3[(iShift4 >> 8) & 255], 24)) ^ shift(iArr3[(iShift3 >> 16) & 255], 16)) ^ shift(iArr3[(iShift2 >> 24) & 255], 8)) ^ iArr[i19][c13];
            z10 = z11 ? 1 : 0;
            i14 = i18;
            i13 = iShift6;
            i15 = iShift7;
            i16 = iShift8;
            c10 = c12;
            c11 = c13;
        }
        boolean z12 = z10;
        int i21 = i14;
        char c14 = c10;
        char c15 = c11;
        int[] iArr4 = Tinv0;
        int iShift9 = (((iArr4[i13 & 255] ^ shift(iArr4[(iShift >> 8) & 255], 24)) ^ shift(iArr4[(i16 >> 16) & 255], 16)) ^ shift(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i17][z12 ? 1 : 0];
        int iShift10 = (((iArr4[i15 & 255] ^ shift(iArr4[(i13 >> 8) & 255], 24)) ^ shift(iArr4[(iShift >> 16) & 255], 16)) ^ shift(iArr4[(i16 >> 24) & 255], 8)) ^ iArr[i17][i21];
        int iShift11 = (((iArr4[i16 & 255] ^ shift(iArr4[(i15 >> 8) & 255], 24)) ^ shift(iArr4[(i13 >> 16) & 255], 16)) ^ shift(iArr4[(iShift >> 24) & 255], 8)) ^ iArr[i17][c14];
        int iShift12 = (((iArr4[iShift & 255] ^ shift(iArr4[(i16 >> 8) & 255], 24)) ^ shift(iArr4[(i15 >> 16) & 255], 16)) ^ shift(iArr4[(i13 >> 24) & 255], 8)) ^ iArr[i17][c15];
        byte[] bArr3 = Si;
        int i22 = bArr3[iShift9 & 255] & 255;
        byte[] bArr4 = this.f19948s;
        int i23 = ((i22 ^ ((bArr4[(iShift12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iShift11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iShift10 >> 24) & 255] << 24);
        int[] iArr5 = iArr[z12 ? 1 : 0];
        int i24 = i23 ^ iArr5[z12 ? 1 : 0];
        int i25 = ((((bArr4[iShift10 & 255] & 255) ^ ((bArr4[(iShift9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iShift12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iShift11 >> 24) & 255] << 24)) ^ iArr5[i21];
        int i26 = ((((bArr4[iShift11 & 255] & 255) ^ ((bArr3[(iShift10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iShift9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iShift12 >> 24) & 255] << 24)) ^ iArr5[c14];
        int i27 = ((((bArr3[iShift12 & 255] & 255) ^ ((bArr4[(iShift11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iShift10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iShift9 >> 24) & 255] << 24)) ^ iArr5[c15];
        Pack.intToLittleEndian(i24, bArr2, i11);
        Pack.intToLittleEndian(i25, bArr2, i11 + 4);
        Pack.intToLittleEndian(i26, bArr2, i11 + 8);
        Pack.intToLittleEndian(i27, bArr2, i11 + 12);
    }

    private void encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i10 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i10 + 12);
        boolean z10 = false;
        int[] iArr2 = iArr[0];
        int i12 = iLittleEndianToInt ^ iArr2[0];
        int i13 = 1;
        int i14 = iLittleEndianToInt2 ^ iArr2[1];
        char c10 = 2;
        int i15 = iLittleEndianToInt3 ^ iArr2[2];
        char c11 = 3;
        int iShift = iLittleEndianToInt4 ^ iArr2[3];
        int i16 = 1;
        while (i16 < this.ROUNDS - i13) {
            int[] iArr3 = T0;
            boolean z11 = z10;
            int i17 = i13;
            int iShift2 = (((iArr3[i12 & 255] ^ shift(iArr3[(i14 >> 8) & 255], 24)) ^ shift(iArr3[(i15 >> 16) & 255], 16)) ^ shift(iArr3[(iShift >> 24) & 255], 8)) ^ iArr[i16][z11 ? 1 : 0];
            char c12 = c10;
            int iShift3 = (((iArr3[i14 & 255] ^ shift(iArr3[(i15 >> 8) & 255], 24)) ^ shift(iArr3[(iShift >> 16) & 255], 16)) ^ shift(iArr3[(i12 >> 24) & 255], 8)) ^ iArr[i16][i17];
            char c13 = c11;
            int iShift4 = (((iArr3[i15 & 255] ^ shift(iArr3[(iShift >> 8) & 255], 24)) ^ shift(iArr3[(i12 >> 16) & 255], 16)) ^ shift(iArr3[(i14 >> 24) & 255], 8)) ^ iArr[i16][c12];
            int iShift5 = ((iArr3[iShift & 255] ^ shift(iArr3[(i12 >> 8) & 255], 24)) ^ shift(iArr3[(i14 >> 16) & 255], 16)) ^ shift(iArr3[(i15 >> 24) & 255], 8);
            int i18 = i16 + 1;
            int i19 = iShift5 ^ iArr[i16][c13];
            int iShift6 = (((iArr3[iShift2 & 255] ^ shift(iArr3[(iShift3 >> 8) & 255], 24)) ^ shift(iArr3[(iShift4 >> 16) & 255], 16)) ^ shift(iArr3[(i19 >> 24) & 255], 8)) ^ iArr[i18][z11 ? 1 : 0];
            int iShift7 = (((iArr3[iShift3 & 255] ^ shift(iArr3[(iShift4 >> 8) & 255], 24)) ^ shift(iArr3[(i19 >> 16) & 255], 16)) ^ shift(iArr3[(iShift2 >> 24) & 255], 8)) ^ iArr[i18][i17];
            int iShift8 = (((iArr3[iShift4 & 255] ^ shift(iArr3[(i19 >> 8) & 255], 24)) ^ shift(iArr3[(iShift2 >> 16) & 255], 16)) ^ shift(iArr3[(iShift3 >> 24) & 255], 8)) ^ iArr[i18][c12];
            i16 += 2;
            iShift = (((iArr3[i19 & 255] ^ shift(iArr3[(iShift2 >> 8) & 255], 24)) ^ shift(iArr3[(iShift3 >> 16) & 255], 16)) ^ shift(iArr3[(iShift4 >> 24) & 255], 8)) ^ iArr[i18][c13];
            z10 = z11 ? 1 : 0;
            i13 = i17;
            i12 = iShift6;
            i14 = iShift7;
            i15 = iShift8;
            c10 = c12;
            c11 = c13;
        }
        boolean z12 = z10;
        int i20 = i13;
        char c14 = c10;
        char c15 = c11;
        int[] iArr4 = T0;
        int iShift9 = (((iArr4[i12 & 255] ^ shift(iArr4[(i14 >> 8) & 255], 24)) ^ shift(iArr4[(i15 >> 16) & 255], 16)) ^ shift(iArr4[(iShift >> 24) & 255], 8)) ^ iArr[i16][z12 ? 1 : 0];
        int iShift10 = (((iArr4[i14 & 255] ^ shift(iArr4[(i15 >> 8) & 255], 24)) ^ shift(iArr4[(iShift >> 16) & 255], 16)) ^ shift(iArr4[(i12 >> 24) & 255], 8)) ^ iArr[i16][i20];
        int iShift11 = (((iArr4[i15 & 255] ^ shift(iArr4[(iShift >> 8) & 255], 24)) ^ shift(iArr4[(i12 >> 16) & 255], 16)) ^ shift(iArr4[(i14 >> 24) & 255], 8)) ^ iArr[i16][c14];
        int iShift12 = (((iArr4[iShift & 255] ^ shift(iArr4[(i12 >> 8) & 255], 24)) ^ shift(iArr4[(i14 >> 16) & 255], 16)) ^ shift(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i16][c15];
        byte[] bArr3 = S;
        int i21 = (bArr3[iShift9 & 255] & 255) ^ ((bArr3[(iShift10 >> 8) & 255] & 255) << 8);
        byte[] bArr4 = this.f19948s;
        int i22 = (i21 ^ ((bArr4[(iShift11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iShift12 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i16 + 1];
        int i23 = i22 ^ iArr5[z12 ? 1 : 0];
        int i24 = ((((bArr4[iShift10 & 255] & 255) ^ ((bArr3[(iShift11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iShift12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iShift9 >> 24) & 255] << 24)) ^ iArr5[i20];
        int i25 = ((((bArr4[iShift11 & 255] & 255) ^ ((bArr3[(iShift12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iShift9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iShift10 >> 24) & 255] << 24)) ^ iArr5[c14];
        int i26 = ((((bArr4[iShift12 & 255] & 255) ^ ((bArr4[(iShift9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iShift10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iShift11 >> 24) & 255] << 24)) ^ iArr5[c15];
        Pack.intToLittleEndian(i23, bArr2, i11);
        Pack.intToLittleEndian(i24, bArr2, i11 + 4);
        Pack.intToLittleEndian(i25, bArr2, i11 + 8);
        Pack.intToLittleEndian(i26, bArr2, i11 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int i10;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = length >>> 2;
        this.ROUNDS = i11 + 6;
        int i12 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11 + 7, 4);
        char c10 = 3;
        if (i11 == 4) {
            i10 = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i13 = 1; i13 <= 10; i13++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i13 - 1];
                int[] iArr2 = iArr[i13];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i11 == 6) {
            i10 = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int[] iArr3 = iArr[i14];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i15);
                int[] iArr4 = iArr[i14];
                iArr4[2] = iSubWord;
                int i16 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i16;
                int i17 = iLittleEndianToInt7 ^ i16;
                int[] iArr5 = iArr[i14 + 1];
                iArr5[0] = i17;
                int i18 = iLittleEndianToInt8 ^ i17;
                iArr5[1] = i18;
                int i19 = iLittleEndianToInt9 ^ i18;
                iArr5[2] = i19;
                int i20 = iLittleEndianToInt10 ^ i19;
                iArr5[3] = i20;
                int iSubWord2 = subWord(shift(i20, 8)) ^ (i15 << 1);
                i15 <<= 2;
                iLittleEndianToInt5 = iSubWord ^ iSubWord2;
                int[] iArr6 = iArr[i14 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i16 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i17 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i18 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i14 += 3;
                if (i14 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i19 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i20 ^ iLittleEndianToInt9;
            }
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i21 = 1;
            int i22 = 2;
            while (true) {
                int iSubWord3 = subWord(shift(iLittleEndianToInt18, 8)) ^ i21;
                i21 <<= i12;
                iLittleEndianToInt11 ^= iSubWord3;
                int[] iArr7 = iArr[i22];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[i12] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[c10] = iLittleEndianToInt14;
                i10 = i12;
                int i23 = i22 + 1;
                char c11 = c10;
                if (i23 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i23];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[i10] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[c11] = iLittleEndianToInt18;
                i22 += 2;
                i12 = i10;
                c10 = c11;
            }
        }
        if (!z10) {
            for (int i24 = i10; i24 < this.ROUNDS; i24++) {
                for (int i25 = 0; i25 < 4; i25++) {
                    int[] iArr9 = iArr[i24];
                    iArr9[i25] = inv_mcol(iArr9[i25]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i10) {
        int iShift = shift(i10, 8) ^ i10;
        int iFFmulX = i10 ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    public static MultiBlockCipher newInstance() {
        return new AESEngine();
    }

    private static int shift(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private static int subWord(int i10) {
        byte[] bArr = S;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
        this.forEncryption = z10;
        if (z10) {
            this.f19948s = Arrays.clone(S);
        } else {
            this.f19948s = Arrays.clone(Si);
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i10, bArr2, i11, iArr);
        } else {
            decryptBlock(bArr, i10, bArr2, i11, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
