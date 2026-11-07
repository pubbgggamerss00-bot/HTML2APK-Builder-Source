package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SPHINCSPlusParameters {
    private static final Map<Integer, SPHINCSPlusParameters> ID_TO_PARAMS;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_128f;
    public static final SPHINCSPlusParameters haraka_128f_simple;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_128s;
    public static final SPHINCSPlusParameters haraka_128s_simple;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_192f;
    public static final SPHINCSPlusParameters haraka_192f_simple;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_192s;
    public static final SPHINCSPlusParameters haraka_192s_simple;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_256f;
    public static final SPHINCSPlusParameters haraka_256f_simple;

    @Deprecated
    public static final SPHINCSPlusParameters haraka_256s;
    public static final SPHINCSPlusParameters haraka_256s_simple;
    public static final SPHINCSPlusParameters sha2_128f;
    public static final SPHINCSPlusParameters sha2_128f_robust;
    public static final SPHINCSPlusParameters sha2_128s;
    public static final SPHINCSPlusParameters sha2_128s_robust;
    public static final SPHINCSPlusParameters sha2_192f;
    public static final SPHINCSPlusParameters sha2_192f_robust;
    public static final SPHINCSPlusParameters sha2_192s;
    public static final SPHINCSPlusParameters sha2_192s_robust;
    public static final SPHINCSPlusParameters sha2_256f;
    public static final SPHINCSPlusParameters sha2_256f_robust;
    public static final SPHINCSPlusParameters sha2_256s;
    public static final SPHINCSPlusParameters sha2_256s_robust;
    public static final SPHINCSPlusParameters shake_128f;
    public static final SPHINCSPlusParameters shake_128f_robust;
    public static final SPHINCSPlusParameters shake_128s;
    public static final SPHINCSPlusParameters shake_128s_robust;
    public static final SPHINCSPlusParameters shake_192f;
    public static final SPHINCSPlusParameters shake_192f_robust;
    public static final SPHINCSPlusParameters shake_192s;
    public static final SPHINCSPlusParameters shake_192s_robust;
    public static final SPHINCSPlusParameters shake_256f;
    public static final SPHINCSPlusParameters shake_256f_robust;
    public static final SPHINCSPlusParameters shake_256s;
    public static final SPHINCSPlusParameters shake_256s_robust;
    private final SPHINCSPlusEngineProvider engineProvider;

    /* renamed from: id, reason: collision with root package name */
    private final Integer f20428id;
    private final String name;

    public static class HarakaSEngineProvider implements SPHINCSPlusEngineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final int f20429a;

        /* renamed from: d, reason: collision with root package name */
        private final int f20430d;

        /* renamed from: h, reason: collision with root package name */
        private final int f20431h;

        /* renamed from: k, reason: collision with root package name */
        private final int f20432k;

        /* renamed from: n, reason: collision with root package name */
        private final int f20433n;
        private final boolean robust;

        /* renamed from: w, reason: collision with root package name */
        private final int f20434w;

        public HarakaSEngineProvider(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.robust = z10;
            this.f20433n = i10;
            this.f20434w = i11;
            this.f20430d = i12;
            this.f20429a = i13;
            this.f20432k = i14;
            this.f20431h = i15;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public SPHINCSPlusEngine get() {
            return new SPHINCSPlusEngine.HarakaSEngine(this.robust, this.f20433n, this.f20434w, this.f20430d, this.f20429a, this.f20432k, this.f20431h);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public int getN() {
            return this.f20433n;
        }
    }

    public static class Sha2EngineProvider implements SPHINCSPlusEngineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final int f20435a;

        /* renamed from: d, reason: collision with root package name */
        private final int f20436d;

        /* renamed from: h, reason: collision with root package name */
        private final int f20437h;

        /* renamed from: k, reason: collision with root package name */
        private final int f20438k;

        /* renamed from: n, reason: collision with root package name */
        private final int f20439n;
        private final boolean robust;

        /* renamed from: w, reason: collision with root package name */
        private final int f20440w;

        public Sha2EngineProvider(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.robust = z10;
            this.f20439n = i10;
            this.f20440w = i11;
            this.f20436d = i12;
            this.f20435a = i13;
            this.f20438k = i14;
            this.f20437h = i15;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public SPHINCSPlusEngine get() {
            return new SPHINCSPlusEngine.Sha2Engine(this.robust, this.f20439n, this.f20440w, this.f20436d, this.f20435a, this.f20438k, this.f20437h);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public int getN() {
            return this.f20439n;
        }
    }

    public static class Shake256EngineProvider implements SPHINCSPlusEngineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final int f20441a;

        /* renamed from: d, reason: collision with root package name */
        private final int f20442d;

        /* renamed from: h, reason: collision with root package name */
        private final int f20443h;

        /* renamed from: k, reason: collision with root package name */
        private final int f20444k;

        /* renamed from: n, reason: collision with root package name */
        private final int f20445n;
        private final boolean robust;

        /* renamed from: w, reason: collision with root package name */
        private final int f20446w;

        public Shake256EngineProvider(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.robust = z10;
            this.f20445n = i10;
            this.f20446w = i11;
            this.f20442d = i12;
            this.f20441a = i13;
            this.f20444k = i14;
            this.f20443h = i15;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public SPHINCSPlusEngine get() {
            return new SPHINCSPlusEngine.Shake256Engine(this.robust, this.f20445n, this.f20446w, this.f20442d, this.f20441a, this.f20444k, this.f20443h);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngineProvider
        public int getN() {
            return this.f20445n;
        }
    }

    static {
        SPHINCSPlusParameters sPHINCSPlusParameters = new SPHINCSPlusParameters(Integers.valueOf(65793), "sha2-128f-robust", new Sha2EngineProvider(true, 16, 16, 22, 6, 33, 66));
        sha2_128f_robust = sPHINCSPlusParameters;
        SPHINCSPlusParameters sPHINCSPlusParameters2 = new SPHINCSPlusParameters(Integers.valueOf(65794), "sha2-128s-robust", new Sha2EngineProvider(true, 16, 16, 7, 12, 14, 63));
        sha2_128s_robust = sPHINCSPlusParameters2;
        SPHINCSPlusParameters sPHINCSPlusParameters3 = new SPHINCSPlusParameters(Integers.valueOf(65795), "sha2-192f-robust", new Sha2EngineProvider(true, 24, 16, 22, 8, 33, 66));
        sha2_192f_robust = sPHINCSPlusParameters3;
        SPHINCSPlusParameters sPHINCSPlusParameters4 = new SPHINCSPlusParameters(Integers.valueOf(65796), "sha2-192s-robust", new Sha2EngineProvider(true, 24, 16, 7, 14, 17, 63));
        sha2_192s_robust = sPHINCSPlusParameters4;
        SPHINCSPlusParameters sPHINCSPlusParameters5 = new SPHINCSPlusParameters(Integers.valueOf(65797), "sha2-256f-robust", new Sha2EngineProvider(true, 32, 16, 17, 9, 35, 68));
        sha2_256f_robust = sPHINCSPlusParameters5;
        SPHINCSPlusParameters sPHINCSPlusParameters6 = new SPHINCSPlusParameters(Integers.valueOf(65798), "sha2-256s-robust", new Sha2EngineProvider(true, 32, 16, 8, 14, 22, 64));
        sha2_256s_robust = sPHINCSPlusParameters6;
        SPHINCSPlusParameters sPHINCSPlusParameters7 = new SPHINCSPlusParameters(Integers.valueOf(66049), "sha2-128f", new Sha2EngineProvider(false, 16, 16, 22, 6, 33, 66));
        sha2_128f = sPHINCSPlusParameters7;
        SPHINCSPlusParameters sPHINCSPlusParameters8 = new SPHINCSPlusParameters(Integers.valueOf(66050), "sha2-128s", new Sha2EngineProvider(false, 16, 16, 7, 12, 14, 63));
        sha2_128s = sPHINCSPlusParameters8;
        SPHINCSPlusParameters sPHINCSPlusParameters9 = new SPHINCSPlusParameters(Integers.valueOf(66051), "sha2-192f", new Sha2EngineProvider(false, 24, 16, 22, 8, 33, 66));
        sha2_192f = sPHINCSPlusParameters9;
        SPHINCSPlusParameters sPHINCSPlusParameters10 = new SPHINCSPlusParameters(Integers.valueOf(66052), "sha2-192s", new Sha2EngineProvider(false, 24, 16, 7, 14, 17, 63));
        sha2_192s = sPHINCSPlusParameters10;
        SPHINCSPlusParameters sPHINCSPlusParameters11 = new SPHINCSPlusParameters(Integers.valueOf(66053), "sha2-256f", new Sha2EngineProvider(false, 32, 16, 17, 9, 35, 68));
        sha2_256f = sPHINCSPlusParameters11;
        SPHINCSPlusParameters sPHINCSPlusParameters12 = new SPHINCSPlusParameters(Integers.valueOf(66054), "sha2-256s", new Sha2EngineProvider(false, 32, 16, 8, 14, 22, 64));
        sha2_256s = sPHINCSPlusParameters12;
        SPHINCSPlusParameters sPHINCSPlusParameters13 = new SPHINCSPlusParameters(Integers.valueOf(131329), "shake-128f-robust", new Shake256EngineProvider(true, 16, 16, 22, 6, 33, 66));
        shake_128f_robust = sPHINCSPlusParameters13;
        SPHINCSPlusParameters sPHINCSPlusParameters14 = new SPHINCSPlusParameters(Integers.valueOf(131330), "shake-128s-robust", new Shake256EngineProvider(true, 16, 16, 7, 12, 14, 63));
        shake_128s_robust = sPHINCSPlusParameters14;
        SPHINCSPlusParameters sPHINCSPlusParameters15 = new SPHINCSPlusParameters(Integers.valueOf(131331), "shake-192f-robust", new Shake256EngineProvider(true, 24, 16, 22, 8, 33, 66));
        shake_192f_robust = sPHINCSPlusParameters15;
        SPHINCSPlusParameters sPHINCSPlusParameters16 = new SPHINCSPlusParameters(Integers.valueOf(131332), "shake-192s-robust", new Shake256EngineProvider(true, 24, 16, 7, 14, 17, 63));
        shake_192s_robust = sPHINCSPlusParameters16;
        SPHINCSPlusParameters sPHINCSPlusParameters17 = new SPHINCSPlusParameters(Integers.valueOf(131333), "shake-256f-robust", new Shake256EngineProvider(true, 32, 16, 17, 9, 35, 68));
        shake_256f_robust = sPHINCSPlusParameters17;
        SPHINCSPlusParameters sPHINCSPlusParameters18 = new SPHINCSPlusParameters(Integers.valueOf(131334), "shake-256s-robust", new Shake256EngineProvider(true, 32, 16, 8, 14, 22, 64));
        shake_256s_robust = sPHINCSPlusParameters18;
        SPHINCSPlusParameters sPHINCSPlusParameters19 = new SPHINCSPlusParameters(Integers.valueOf(131585), "shake-128f", new Shake256EngineProvider(false, 16, 16, 22, 6, 33, 66));
        shake_128f = sPHINCSPlusParameters19;
        SPHINCSPlusParameters sPHINCSPlusParameters20 = new SPHINCSPlusParameters(Integers.valueOf(131586), "shake-128s", new Shake256EngineProvider(false, 16, 16, 7, 12, 14, 63));
        shake_128s = sPHINCSPlusParameters20;
        SPHINCSPlusParameters sPHINCSPlusParameters21 = new SPHINCSPlusParameters(Integers.valueOf(131587), "shake-192f", new Shake256EngineProvider(false, 24, 16, 22, 8, 33, 66));
        shake_192f = sPHINCSPlusParameters21;
        SPHINCSPlusParameters sPHINCSPlusParameters22 = new SPHINCSPlusParameters(Integers.valueOf(131588), "shake-192s", new Shake256EngineProvider(false, 24, 16, 7, 14, 17, 63));
        shake_192s = sPHINCSPlusParameters22;
        SPHINCSPlusParameters sPHINCSPlusParameters23 = new SPHINCSPlusParameters(Integers.valueOf(131589), "shake-256f", new Shake256EngineProvider(false, 32, 16, 17, 9, 35, 68));
        shake_256f = sPHINCSPlusParameters23;
        SPHINCSPlusParameters sPHINCSPlusParameters24 = new SPHINCSPlusParameters(Integers.valueOf(131590), "shake-256s", new Shake256EngineProvider(false, 32, 16, 8, 14, 22, 64));
        shake_256s = sPHINCSPlusParameters24;
        SPHINCSPlusParameters sPHINCSPlusParameters25 = new SPHINCSPlusParameters(Integers.valueOf(196865), "haraka-128f-robust", new HarakaSEngineProvider(true, 16, 16, 22, 6, 33, 66));
        haraka_128f = sPHINCSPlusParameters25;
        SPHINCSPlusParameters sPHINCSPlusParameters26 = new SPHINCSPlusParameters(Integers.valueOf(196866), "haraka-128s-robust", new HarakaSEngineProvider(true, 16, 16, 7, 12, 14, 63));
        haraka_128s = sPHINCSPlusParameters26;
        SPHINCSPlusParameters sPHINCSPlusParameters27 = new SPHINCSPlusParameters(Integers.valueOf(196867), "haraka-192f-robust", new HarakaSEngineProvider(true, 24, 16, 22, 8, 33, 66));
        haraka_192f = sPHINCSPlusParameters27;
        SPHINCSPlusParameters sPHINCSPlusParameters28 = new SPHINCSPlusParameters(Integers.valueOf(196868), "haraka-192s-robust", new HarakaSEngineProvider(true, 24, 16, 7, 14, 17, 63));
        haraka_192s = sPHINCSPlusParameters28;
        SPHINCSPlusParameters sPHINCSPlusParameters29 = new SPHINCSPlusParameters(Integers.valueOf(196869), "haraka-256f-robust", new HarakaSEngineProvider(true, 32, 16, 17, 9, 35, 68));
        haraka_256f = sPHINCSPlusParameters29;
        SPHINCSPlusParameters sPHINCSPlusParameters30 = new SPHINCSPlusParameters(Integers.valueOf(196870), "haraka-256s-robust", new HarakaSEngineProvider(true, 32, 16, 8, 14, 22, 64));
        haraka_256s = sPHINCSPlusParameters30;
        SPHINCSPlusParameters sPHINCSPlusParameters31 = new SPHINCSPlusParameters(Integers.valueOf(197121), "haraka-128f-simple", new HarakaSEngineProvider(false, 16, 16, 22, 6, 33, 66));
        haraka_128f_simple = sPHINCSPlusParameters31;
        SPHINCSPlusParameters sPHINCSPlusParameters32 = new SPHINCSPlusParameters(Integers.valueOf(197122), "haraka-128s-simple", new HarakaSEngineProvider(false, 16, 16, 7, 12, 14, 63));
        haraka_128s_simple = sPHINCSPlusParameters32;
        SPHINCSPlusParameters sPHINCSPlusParameters33 = new SPHINCSPlusParameters(Integers.valueOf(197123), "haraka-192f-simple", new HarakaSEngineProvider(false, 24, 16, 22, 8, 33, 66));
        haraka_192f_simple = sPHINCSPlusParameters33;
        SPHINCSPlusParameters sPHINCSPlusParameters34 = new SPHINCSPlusParameters(Integers.valueOf(197124), "haraka-192s-simple", new HarakaSEngineProvider(false, 24, 16, 7, 14, 17, 63));
        haraka_192s_simple = sPHINCSPlusParameters34;
        SPHINCSPlusParameters sPHINCSPlusParameters35 = new SPHINCSPlusParameters(Integers.valueOf(197125), "haraka-256f-simple", new HarakaSEngineProvider(false, 32, 16, 17, 9, 35, 68));
        haraka_256f_simple = sPHINCSPlusParameters35;
        SPHINCSPlusParameters sPHINCSPlusParameters36 = new SPHINCSPlusParameters(Integers.valueOf(197126), "haraka-256s-simple", new HarakaSEngineProvider(false, 32, 16, 8, 14, 22, 64));
        haraka_256s_simple = sPHINCSPlusParameters36;
        ID_TO_PARAMS = new HashMap();
        SPHINCSPlusParameters[] sPHINCSPlusParametersArr = {sPHINCSPlusParameters, sPHINCSPlusParameters2, sPHINCSPlusParameters3, sPHINCSPlusParameters4, sPHINCSPlusParameters5, sPHINCSPlusParameters6, sPHINCSPlusParameters7, sPHINCSPlusParameters8, sPHINCSPlusParameters9, sPHINCSPlusParameters10, sPHINCSPlusParameters11, sPHINCSPlusParameters12, sPHINCSPlusParameters13, sPHINCSPlusParameters14, sPHINCSPlusParameters15, sPHINCSPlusParameters16, sPHINCSPlusParameters17, sPHINCSPlusParameters18, sPHINCSPlusParameters19, sPHINCSPlusParameters20, sPHINCSPlusParameters21, sPHINCSPlusParameters22, sPHINCSPlusParameters23, sPHINCSPlusParameters24, sPHINCSPlusParameters25, sPHINCSPlusParameters26, sPHINCSPlusParameters27, sPHINCSPlusParameters28, sPHINCSPlusParameters29, sPHINCSPlusParameters30, sPHINCSPlusParameters31, sPHINCSPlusParameters32, sPHINCSPlusParameters33, sPHINCSPlusParameters34, sPHINCSPlusParameters35, sPHINCSPlusParameters36};
        for (int i10 = 0; i10 < 36; i10++) {
            SPHINCSPlusParameters sPHINCSPlusParameters37 = sPHINCSPlusParametersArr[i10];
            ID_TO_PARAMS.put(sPHINCSPlusParameters37.getID(), sPHINCSPlusParameters37);
        }
    }

    private SPHINCSPlusParameters(Integer num, String str, SPHINCSPlusEngineProvider sPHINCSPlusEngineProvider) {
        this.f20428id = num;
        this.name = str;
        this.engineProvider = sPHINCSPlusEngineProvider;
    }

    public static SPHINCSPlusParameters getParams(Integer num) {
        return ID_TO_PARAMS.get(num);
    }

    public byte[] getEncoded() {
        return Pack.intToBigEndian(getID().intValue());
    }

    public SPHINCSPlusEngine getEngine() {
        return this.engineProvider.get();
    }

    public Integer getID() {
        return this.f20428id;
    }

    public int getN() {
        return this.engineProvider.getN();
    }

    public String getName() {
        return this.name;
    }

    public static Integer getID(SPHINCSPlusParameters sPHINCSPlusParameters) {
        return sPHINCSPlusParameters.getID();
    }
}
