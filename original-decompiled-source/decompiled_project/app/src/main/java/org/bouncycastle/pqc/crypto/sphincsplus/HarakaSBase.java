package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class HarakaSBase {
    protected long[][] haraka512_rc = {new long[]{2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L}, new long[]{-2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L}, new long[]{1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L}, new long[]{-2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L}, new long[]{1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L}, new long[]{-797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L}, new long[]{-886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L}, new long[]{2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L}, new long[]{3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L}, new long[]{-8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L}};
    protected int[][] haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
    protected final byte[] buffer = new byte[64];
    protected int off = 0;

    private void Swapn(long[] jArr, int i10, int i11, int i12) {
        long j10;
        long j11;
        if (i10 == 1) {
            j10 = 6148914691236517205L;
            j11 = -6148914691236517206L;
        } else if (i10 == 2) {
            j10 = 3689348814741910323L;
            j11 = -3689348814741910324L;
        } else {
            if (i10 != 4) {
                return;
            }
            j10 = 1085102592571150095L;
            j11 = -1085102592571150096L;
        }
        long j12 = jArr[i11];
        long j13 = jArr[i12];
        jArr[i11] = ((j10 & j13) << i10) | (j12 & j10);
        jArr[i12] = ((j12 & j11) >>> i10) | (j13 & j11);
    }

    private void Swapn32(int[] iArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i10 == 1) {
            i13 = 1431655765;
            i14 = -1431655766;
        } else if (i10 == 2) {
            i13 = 858993459;
            i14 = -858993460;
        } else if (i10 != 4) {
            i13 = 0;
            i14 = 0;
        } else {
            i13 = 252645135;
            i14 = -252645136;
        }
        int i15 = iArr[i11];
        int i16 = iArr[i12];
        iArr[i11] = ((i13 & i16) << i10) | (i15 & i13);
        iArr[i12] = ((i15 & i14) >>> i10) | (i16 & i14);
    }

    private void addRoundKey(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
        jArr[2] = jArr[2] ^ jArr2[2];
        jArr[3] = jArr[3] ^ jArr2[3];
        jArr[4] = jArr[4] ^ jArr2[4];
        jArr[5] = jArr[5] ^ jArr2[5];
        jArr[6] = jArr[6] ^ jArr2[6];
        jArr[7] = jArr[7] ^ jArr2[7];
    }

    private void addRoundKey32(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
        iArr[4] = iArr[4] ^ iArr2[4];
        iArr[5] = iArr[5] ^ iArr2[5];
        iArr[6] = iArr[6] ^ iArr2[6];
        iArr[7] = iArr2[7] ^ iArr[7];
    }

    private void brAesCt64BitsliceSbox(long[] jArr) {
        long j10 = jArr[7];
        long j11 = jArr[6];
        long j12 = jArr[5];
        long j13 = jArr[4];
        long j14 = jArr[3];
        long j15 = jArr[2];
        long j16 = jArr[1];
        long j17 = jArr[0];
        long j18 = j13 ^ j15;
        long j19 = j10 ^ j16;
        long j20 = j10 ^ j13;
        long j21 = j10 ^ j15;
        long j22 = j12 ^ j11;
        long j23 = j22 ^ j17;
        long j24 = j23 ^ j13;
        long j25 = j19 ^ j18;
        long j26 = j23 ^ j10;
        long j27 = j23 ^ j16;
        long j28 = j27 ^ j21;
        long j29 = j14 ^ j25;
        long j30 = j29 ^ j15;
        long j31 = j11 ^ j29;
        long j32 = j30 ^ j17;
        long j33 = j30 ^ j22;
        long j34 = j31 ^ j20;
        long j35 = j17 ^ j34;
        long j36 = j33 ^ j34;
        long j37 = j22 ^ j34;
        long j38 = j25 & j30;
        long j39 = (j28 & j32) ^ j38;
        long j40 = j19 & j37;
        long j41 = (j27 & j23) ^ j40;
        long j42 = j20 & j34;
        long j43 = (j18 & j36) ^ j42;
        long j44 = (j21 & j33) ^ j42;
        long j45 = (j39 ^ j43) ^ j31;
        long j46 = (((j24 & j17) ^ j38) ^ j44) ^ (j33 ^ j21);
        long j47 = (j41 ^ j43) ^ (j19 ^ j37);
        long j48 = (((j26 & j35) ^ j40) ^ j44) ^ (j10 ^ j37);
        long j49 = j45 ^ j46;
        long j50 = j45 & j47;
        long j51 = j48 ^ j50;
        long j52 = (j49 & j51) ^ j46;
        long j53 = ((j46 ^ j50) & (j47 ^ j48)) ^ j48;
        long j54 = j48 & (j51 ^ j53);
        long j55 = j54 ^ (j47 ^ j53);
        long j56 = j49 ^ (j52 & (j51 ^ j54));
        long j57 = j56 ^ j55;
        long j58 = j52 ^ j53;
        long j59 = j52 ^ j56;
        long j60 = j53 ^ j55;
        long j61 = j58 ^ j57;
        long j62 = j53 & j17;
        long j63 = j59 & j37;
        long j64 = j56 & j23;
        long j65 = j52 & j35;
        long j66 = j61 & j36;
        long j67 = j55 & j28;
        long j68 = j53 & j24;
        long j69 = j59 & j19;
        long j70 = j56 & j27;
        long j71 = j58 & j20;
        long j72 = j61 & j18;
        long j73 = j57 & j21;
        long j74 = j71 ^ j72;
        long j75 = j65 ^ j70;
        long j76 = (j60 & j25) ^ j67;
        long j77 = (j60 & j30) ^ j63;
        long j78 = j72 ^ j73;
        long j79 = (j62 ^ j69) ^ j77;
        long j80 = j64 ^ j74;
        long j81 = j63 ^ ((j58 & j34) ^ j66);
        long j82 = j74 ^ j79;
        long j83 = (j52 & j26) ^ j79;
        long j84 = (j66 ^ (j57 & j33)) ^ j80;
        long j85 = j76 ^ j80;
        long j86 = j64 ^ j81;
        long j87 = j83 ^ j84;
        long j88 = (j55 & j32) ^ j85;
        long j89 = (~j84) ^ (j69 ^ j75);
        long j90 = j75 ^ (~j82);
        long j91 = j77 ^ j88;
        long j92 = j86 ^ (~j91);
        long j93 = j78 ^ (~(j86 ^ j87));
        jArr[7] = j81 ^ j85;
        jArr[6] = j92;
        jArr[5] = j93;
        jArr[4] = j91;
        jArr[3] = (j62 ^ j65) ^ j88;
        jArr[2] = (j67 ^ j68) ^ j87;
        jArr[1] = j89;
        jArr[0] = j90;
    }

    private void brAesCt64InterleaveIn(long[] jArr, int i10, int[] iArr, int i11) {
        long j10 = iArr[i11] & BodyPartID.bodyIdMax;
        long j11 = iArr[i11 + 1] & BodyPartID.bodyIdMax;
        long j12 = iArr[i11 + 2] & BodyPartID.bodyIdMax;
        long j13 = iArr[i11 + 3] & BodyPartID.bodyIdMax;
        long j14 = (j10 | (j10 << 16)) & 281470681808895L;
        long j15 = (j11 | (j11 << 16)) & 281470681808895L;
        long j16 = (j12 | (j12 << 16)) & 281470681808895L;
        long j17 = (j13 | (j13 << 16)) & 281470681808895L;
        jArr[i10] = ((j14 | (j14 << 8)) & 71777214294589695L) | (((j16 | (j16 << 8)) & 71777214294589695L) << 8);
        jArr[i10 + 4] = (((j17 | (j17 << 8)) & 71777214294589695L) << 8) | ((j15 | (j15 << 8)) & 71777214294589695L);
    }

    private void brAesCt64InterleaveOut(int[] iArr, long[] jArr, int i10) {
        long j10 = jArr[i10];
        long j11 = j10 & 71777214294589695L;
        long j12 = jArr[i10 + 4];
        long j13 = j12 & 71777214294589695L;
        long j14 = (j10 >>> 8) & 71777214294589695L;
        long j15 = 71777214294589695L & (j12 >>> 8);
        long j16 = (j11 | (j11 >>> 8)) & 281470681808895L;
        long j17 = ((j13 >>> 8) | j13) & 281470681808895L;
        long j18 = (j14 | (j14 >>> 8)) & 281470681808895L;
        long j19 = (j15 | (j15 >>> 8)) & 281470681808895L;
        int i11 = i10 << 2;
        iArr[i11] = (int) (j16 | (j16 >>> 16));
        iArr[i11 + 1] = (int) (j17 | (j17 >>> 16));
        iArr[i11 + 2] = (int) (j18 | (j18 >>> 16));
        iArr[i11 + 3] = (int) ((j19 >>> 16) | j19);
    }

    private void brAesCt64Ortho(long[] jArr) {
        Swapn(jArr, 1, 0, 1);
        Swapn(jArr, 1, 2, 3);
        Swapn(jArr, 1, 4, 5);
        Swapn(jArr, 1, 6, 7);
        Swapn(jArr, 2, 0, 2);
        Swapn(jArr, 2, 1, 3);
        Swapn(jArr, 2, 4, 6);
        Swapn(jArr, 2, 5, 7);
        Swapn(jArr, 4, 0, 4);
        Swapn(jArr, 4, 1, 5);
        Swapn(jArr, 4, 2, 6);
        Swapn(jArr, 4, 3, 7);
    }

    private static void brAesCtBitsliceSbox(int[] iArr) {
        int i10 = iArr[7];
        int i11 = iArr[6];
        int i12 = iArr[5];
        int i13 = iArr[4];
        int i14 = iArr[3];
        int i15 = iArr[2];
        int i16 = iArr[1];
        int i17 = iArr[0];
        int i18 = i13 ^ i15;
        int i19 = i10 ^ i16;
        int i20 = i10 ^ i13;
        int i21 = i10 ^ i15;
        int i22 = i12 ^ i11;
        int i23 = i22 ^ i17;
        int i24 = i23 ^ i13;
        int i25 = i19 ^ i18;
        int i26 = i23 ^ i10;
        int i27 = i23 ^ i16;
        int i28 = i27 ^ i21;
        int i29 = i14 ^ i25;
        int i30 = i15 ^ i29;
        int i31 = i11 ^ i29;
        int i32 = i30 ^ i17;
        int i33 = i30 ^ i22;
        int i34 = i31 ^ i20;
        int i35 = i17 ^ i34;
        int i36 = i33 ^ i34;
        int i37 = i22 ^ i34;
        int i38 = i25 & i30;
        int i39 = (i28 & i32) ^ i38;
        int i40 = i19 & i37;
        int i41 = (i27 & i23) ^ i40;
        int i42 = i20 & i34;
        int i43 = (i18 & i36) ^ i42;
        int i44 = (i21 & i33) ^ i42;
        int i45 = (i39 ^ i43) ^ i31;
        int i46 = (((i24 & i17) ^ i38) ^ i44) ^ (i33 ^ i21);
        int i47 = (i41 ^ i43) ^ (i19 ^ i37);
        int i48 = (((i26 & i35) ^ i40) ^ i44) ^ (i10 ^ i37);
        int i49 = i45 ^ i46;
        int i50 = i45 & i47;
        int i51 = i48 ^ i50;
        int i52 = (i49 & i51) ^ i46;
        int i53 = ((i46 ^ i50) & (i47 ^ i48)) ^ i48;
        int i54 = i48 & (i51 ^ i53);
        int i55 = i54 ^ (i47 ^ i53);
        int i56 = i49 ^ (i52 & (i51 ^ i54));
        int i57 = i56 ^ i55;
        int i58 = i52 ^ i53;
        int i59 = i52 ^ i56;
        int i60 = i53 ^ i55;
        int i61 = i58 ^ i57;
        int i62 = i17 & i53;
        int i63 = i59 & i37;
        int i64 = i56 & i23;
        int i65 = i52 & i35;
        int i66 = i61 & i36;
        int i67 = i55 & i28;
        int i68 = i53 & i24;
        int i69 = i59 & i19;
        int i70 = i56 & i27;
        int i71 = i58 & i20;
        int i72 = i61 & i18;
        int i73 = i57 & i21;
        int i74 = i71 ^ i72;
        int i75 = i65 ^ i70;
        int i76 = (i60 & i25) ^ i67;
        int i77 = (i60 & i30) ^ i63;
        int i78 = i72 ^ i73;
        int i79 = (i62 ^ i69) ^ i77;
        int i80 = i64 ^ i74;
        int i81 = i63 ^ ((i58 & i34) ^ i66);
        int i82 = i74 ^ i79;
        int i83 = (i52 & i26) ^ i79;
        int i84 = (i66 ^ (i57 & i33)) ^ i80;
        int i85 = i76 ^ i80;
        int i86 = i64 ^ i81;
        int i87 = i83 ^ i84;
        int i88 = (i55 & i32) ^ i85;
        int i89 = (~i84) ^ (i69 ^ i75);
        int i90 = (~i82) ^ i75;
        int i91 = i77 ^ i88;
        int i92 = i86 ^ (~i91);
        int i93 = i78 ^ (~(i86 ^ i87));
        iArr[7] = i81 ^ i85;
        iArr[6] = i92;
        iArr[5] = i93;
        iArr[4] = i91;
        iArr[3] = i88 ^ (i62 ^ i65);
        iArr[2] = (i67 ^ i68) ^ i87;
        iArr[1] = i89;
        iArr[0] = i90;
    }

    private void brAesCtOrtho(int[] iArr) {
        Swapn32(iArr, 1, 0, 1);
        Swapn32(iArr, 1, 2, 3);
        Swapn32(iArr, 1, 4, 5);
        Swapn32(iArr, 1, 6, 7);
        Swapn32(iArr, 2, 0, 2);
        Swapn32(iArr, 2, 1, 3);
        Swapn32(iArr, 2, 4, 6);
        Swapn32(iArr, 2, 5, 7);
        Swapn32(iArr, 4, 0, 4);
        Swapn32(iArr, 4, 1, 5);
        Swapn32(iArr, 4, 2, 6);
        Swapn32(iArr, 4, 3, 7);
    }

    private int brDec32Le(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] << 8) & 65280) | ((bArr[i10 + 2] << RegisterType.UNINIT_REF) & 16711680);
    }

    private void brEnc32Le(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i11 + i12] = (byte) (i10 >> (i12 << 3));
        }
    }

    private void brRangeDec32Le(byte[] bArr, int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = (i11 << 2) + i10;
            iArr[i11] = (bArr[i12 + 3] << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] << 8) & 65280) | ((bArr[i12 + 2] << 16) & 16711680);
        }
    }

    private void mixColumns(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (j10 >>> 16) | (j10 << 48);
        long j19 = (j11 >>> 16) | (j11 << 48);
        long j20 = (j12 >>> 16) | (j12 << 48);
        long j21 = (j13 >>> 16) | (j13 << 48);
        long j22 = (j14 >>> 16) | (j14 << 48);
        long j23 = (j15 >>> 16) | (j15 << 48);
        long j24 = (j16 >>> 16) | (j16 << 48);
        long j25 = (j17 >>> 16) | (j17 << 48);
        long j26 = j17 ^ j25;
        long j27 = j10 ^ j18;
        jArr[0] = (j26 ^ j18) ^ rotr32(j27);
        long j28 = j11 ^ j19;
        jArr[1] = (((j27 ^ j17) ^ j25) ^ j19) ^ rotr32(j28);
        long j29 = j12 ^ j20;
        jArr[2] = (j28 ^ j20) ^ rotr32(j29);
        long j30 = ((j29 ^ j17) ^ j25) ^ j21;
        long j31 = j13 ^ j21;
        jArr[3] = j30 ^ rotr32(j31);
        long j32 = ((j31 ^ j17) ^ j25) ^ j22;
        long j33 = j14 ^ j22;
        jArr[4] = j32 ^ rotr32(j33);
        long j34 = j33 ^ j23;
        long j35 = j15 ^ j23;
        jArr[5] = j34 ^ rotr32(j35);
        long j36 = j35 ^ j24;
        long j37 = j16 ^ j24;
        jArr[6] = j36 ^ rotr32(j37);
        jArr[7] = rotr32(j26) ^ (j37 ^ j25);
    }

    private void mixColumns32(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = (i10 >>> 8) | (i10 << 24);
        int i19 = (i11 >>> 8) | (i11 << 24);
        int i20 = (i12 >>> 8) | (i12 << 24);
        int i21 = (i13 >>> 8) | (i13 << 24);
        int i22 = (i14 >>> 8) | (i14 << 24);
        int i23 = (i15 >>> 8) | (i15 << 24);
        int i24 = (i16 >>> 8) | (i16 << 24);
        int i25 = (i17 >>> 8) | (i17 << 24);
        int i26 = i17 ^ i25;
        int i27 = i10 ^ i18;
        iArr[0] = (i26 ^ i18) ^ rotr16(i27);
        int i28 = i11 ^ i19;
        iArr[1] = (((i27 ^ i17) ^ i25) ^ i19) ^ rotr16(i28);
        int i29 = i12 ^ i20;
        iArr[2] = (i28 ^ i20) ^ rotr16(i29);
        int i30 = ((i29 ^ i17) ^ i25) ^ i21;
        int i31 = i13 ^ i21;
        iArr[3] = i30 ^ rotr16(i31);
        int i32 = ((i31 ^ i17) ^ i25) ^ i22;
        int i33 = i14 ^ i22;
        iArr[4] = i32 ^ rotr16(i33);
        int i34 = i33 ^ i23;
        int i35 = i15 ^ i23;
        iArr[5] = i34 ^ rotr16(i35);
        int i36 = i35 ^ i24;
        int i37 = i16 ^ i24;
        iArr[6] = i36 ^ rotr16(i37);
        iArr[7] = rotr16(i26) ^ (i37 ^ i25);
    }

    private int rotr16(int i10) {
        return (i10 >>> 16) | (i10 << 16);
    }

    private long rotr32(long j10) {
        return (j10 >>> 32) | (j10 << 32);
    }

    private void shiftRows(long[] jArr) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long j10 = jArr[i10];
            jArr[i10] = ((j10 & 1152640029630136320L) << 4) | (65535 & j10) | ((4293918720L & j10) >>> 4) | ((983040 & j10) << 12) | ((280375465082880L & j10) >>> 8) | ((1095216660480L & j10) << 8) | (((-1152921504606846976L) & j10) >>> 12);
        }
    }

    private void shiftRows32(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = ((i11 & 1056964608) << 2) | (i11 & 255) | ((64512 & i11) >>> 2) | ((i11 & 768) << 6) | ((15728640 & i11) >>> 4) | ((983040 & i11) << 4) | (((-1073741824) & i11) >>> 6);
        }
    }

    public static void xor(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            bArr3[i12 + i14] = (byte) (bArr[i10 + i14] ^ bArr2[i11 + i14]);
        }
    }

    public void haraka256Perm(byte[] bArr) {
        int[] iArr = new int[8];
        interleaveConstant32(iArr, this.buffer, 0);
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 2; i11++) {
                brAesCtBitsliceSbox(iArr);
                shiftRows32(iArr);
                mixColumns32(iArr);
                addRoundKey32(iArr, this.haraka256_rc[(i10 << 1) + i11]);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = iArr[i12];
                iArr[i12] = ((i13 & 1077952576) >>> 1) | ((-2122219135) & i13) | ((33686018 & i13) << 1) | ((67372036 & i13) << 2) | ((134744072 & i13) << 3) | ((269488144 & i13) >>> 3) | ((538976288 & i13) >>> 2);
            }
        }
        brAesCtOrtho(iArr);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 << 1;
            int i16 = i14 << 2;
            brEnc32Le(bArr, iArr[i15], i16);
            brEnc32Le(bArr, iArr[i15 + 1], i16 + 16);
        }
    }

    public void haraka512Perm(byte[] bArr) {
        int[] iArr = new int[16];
        long[] jArr = new long[8];
        brRangeDec32Le(this.buffer, iArr, 0);
        for (int i10 = 0; i10 < 4; i10++) {
            brAesCt64InterleaveIn(jArr, i10, iArr, i10 << 2);
        }
        brAesCt64Ortho(jArr);
        for (int i11 = 0; i11 < 5; i11++) {
            for (int i12 = 0; i12 < 2; i12++) {
                brAesCt64BitsliceSbox(jArr);
                shiftRows(jArr);
                mixColumns(jArr);
                addRoundKey(jArr, this.haraka512_rc[(i11 << 1) + i12]);
            }
            for (int i13 = 0; i13 < 8; i13++) {
                long j10 = jArr[i13];
                jArr[i13] = ((j10 & (-8934996522953571328L)) >>> 3) | ((281479271743489L & j10) << 5) | ((562958543486978L & j10) << 12) | ((1125917086973956L & j10) >>> 1) | ((2251834173947912L & j10) << 6) | ((9007336695791648L & j10) << 9) | ((18014673391583296L & j10) >>> 4) | ((36029346783166592L & j10) << 3) | ((2377936887688995072L & j10) >>> 5) | ((148621055480562192L & j10) << 2) | ((576469548530665472L & j10) << 4) | ((1152939097061330944L & j10) >>> 12) | ((4611756388245323776L & j10) >>> 10);
            }
        }
        brAesCt64Ortho(jArr);
        for (int i14 = 0; i14 < 4; i14++) {
            brAesCt64InterleaveOut(iArr, jArr, i14);
        }
        for (int i15 = 0; i15 < 16; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                bArr[(i15 << 2) + i16] = (byte) ((iArr[i15] >>> (i16 << 3)) & 255);
            }
        }
    }

    public void interleaveConstant(long[] jArr, byte[] bArr, int i10) {
        int[] iArr = new int[16];
        brRangeDec32Le(bArr, iArr, i10);
        for (int i11 = 0; i11 < 4; i11++) {
            brAesCt64InterleaveIn(jArr, i11, iArr, i11 << 2);
        }
        brAesCt64Ortho(jArr);
    }

    public void interleaveConstant32(int[] iArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 << 1;
            int i13 = (i11 << 2) + i10;
            iArr[i12] = brDec32Le(bArr, i13);
            iArr[i12 + 1] = brDec32Le(bArr, i13 + 16);
        }
        brAesCtOrtho(iArr);
    }

    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }
}
