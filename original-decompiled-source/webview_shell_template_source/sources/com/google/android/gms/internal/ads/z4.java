package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z4 implements x0 {

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f11138e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f11139f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f11140g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f11141h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final UUID f11142i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f11143j0;
    public long A;
    public long B;
    public long C;
    public gt0 D;
    public gt0 E;
    public boolean F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public int[] M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public long S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final b5 f11144a;

    /* renamed from: a0, reason: collision with root package name */
    public byte f11145a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f11146b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f11147b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11148c;

    /* renamed from: c0, reason: collision with root package name */
    public z0 f11149c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11150d;

    /* renamed from: d0, reason: collision with root package name */
    public final x4 f11151d0;

    /* renamed from: e, reason: collision with root package name */
    public final z6 f11152e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0 f11153f;

    /* renamed from: g, reason: collision with root package name */
    public final ex0 f11154g;
    public final ex0 h;

    /* renamed from: i, reason: collision with root package name */
    public final ex0 f11155i;

    /* renamed from: j, reason: collision with root package name */
    public final ex0 f11156j;

    /* renamed from: k, reason: collision with root package name */
    public final ex0 f11157k;

    /* renamed from: l, reason: collision with root package name */
    public final ex0 f11158l;

    /* renamed from: m, reason: collision with root package name */
    public final ex0 f11159m;

    /* renamed from: n, reason: collision with root package name */
    public final ex0 f11160n;

    /* renamed from: o, reason: collision with root package name */
    public final ex0 f11161o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f11162p;

    /* renamed from: q, reason: collision with root package name */
    public long f11163q;

    /* renamed from: r, reason: collision with root package name */
    public long f11164r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f11165t;

    /* renamed from: u, reason: collision with root package name */
    public long f11166u;

    /* renamed from: v, reason: collision with root package name */
    public y4 f11167v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11168w;

    /* renamed from: x, reason: collision with root package name */
    public int f11169x;

    /* renamed from: y, reason: collision with root package name */
    public long f11170y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11171z;

    static {
        int i6 = j31.f5914a;
        f11139f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f11140g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f11141h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f11142i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        androidx.camera.camera2.internal.compat.workaround.c.e(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        androidx.camera.camera2.internal.compat.workaround.c.e(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11143j0 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public z4() {
        this(new x4(), 2, z6.f11190i);
    }

    public static byte[] n(String str, long j6, long j7) {
        y5.n(j6 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i6 = (int) (j6 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i6);
        long j8 = j6 - (i6 * 3600000000L);
        int i7 = (int) (j8 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i7);
        long j9 = j8 - (i7 * 60000000);
        int i8 = (int) (j9 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i8), Integer.valueOf((int) ((j9 - (i8 * 1000000)) / j7)));
        int i9 = j31.f5914a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021e, code lost:
    
        if (r2.equals("S_TEXT/UTF8") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0225, code lost:
    
        if (r2.equals("S_TEXT/WEBVTT") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022c, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0233, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (r2.equals("A_PCM/INT/LIT") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        if (r2.equals("A_PCM/INT/BIG") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0248, code lost:
    
        if (r2.equals("A_PCM/FLOAT/IEEE") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024f, code lost:
    
        if (r2.equals("A_DTS/EXPRESS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0256, code lost:
    
        if (r2.equals("V_THEORA") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025d, code lost:
    
        if (r2.equals("S_HDMV/PGS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0264, code lost:
    
        if (r2.equals("V_VP9") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fd, code lost:
    
        if (r2.equals("A_OPUS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ff, code lost:
    
        r2 = r48;
        r16 = "V_VP9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0209, code lost:
    
        if (r2.equals("A_FLAC") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0210, code lost:
    
        if (r2.equals("A_EAC3") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0217, code lost:
    
        if (r2.equals("V_MPEG2") != false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a97  */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i6) throws rn {
        int i7;
        int i8;
        Object obj;
        z4 z4Var;
        String str;
        char c7;
        y4 y4Var;
        int i9;
        String str2;
        String str3;
        List list;
        String str4;
        List list2;
        int i10;
        Pair pair;
        String str5;
        List listSingletonList;
        int i11;
        List list3;
        int i12;
        ArrayList arrayList;
        int iQ;
        List list4;
        List listSingletonList2;
        List list5;
        tk2 tk2Var;
        int i13;
        mb2 mb2Var;
        int i14;
        byte[] bArr;
        int i15;
        String str6;
        u0 u0VarA;
        List list6;
        List list7;
        m1 l1Var;
        int i16;
        int i17;
        y5.k(this.f11149c0);
        SparseArray sparseArray = this.f11146b;
        if (i6 == 160) {
            if (this.H == 2) {
                y4 y4Var2 = (y4) sparseArray.get(this.N);
                y4Var2.Y.getClass();
                if (this.S > 0 && "A_OPUS".equals(y4Var2.f10827b)) {
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.S).array();
                    this.f11161o.h(bArrArray.length, bArrArray);
                }
                int i18 = 0;
                for (int i19 = 0; i19 < this.L; i19++) {
                    i18 += this.M[i19];
                }
                int i20 = 0;
                while (i20 < this.L) {
                    long j6 = this.I + ((y4Var2.f10830e * i20) / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                    int i21 = this.P;
                    if (i20 == 0) {
                        if (!this.R) {
                            i21 |= 1;
                        }
                        i8 = i21;
                        i7 = 0;
                    } else {
                        i7 = i20;
                        i8 = i21;
                    }
                    int i22 = this.M[i7];
                    int i23 = i18 - i22;
                    j(y4Var2, j6, i8, i22, i23);
                    i20 = i7 + 1;
                    i18 = i23;
                }
                this.H = 0;
                return;
            }
            return;
        }
        if (i6 != 174) {
            if (i6 == 19899) {
                int i24 = this.f11169x;
                if (i24 != -1) {
                    long j7 = this.f11170y;
                    if (j7 != -1) {
                        if (i24 == 475249515) {
                            this.A = j7;
                            return;
                        }
                        return;
                    }
                }
                throw rn.a(null, "Mandatory element SeekID or SeekPosition not found");
            }
            if (i6 == 25152) {
                i(i6);
                y4 y4Var3 = this.f11167v;
                if (y4Var3.h) {
                    r1 r1Var = y4Var3.f10834j;
                    if (r1Var == null) {
                        throw rn.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                    }
                    y4Var3.f10836l = new ih2(null, true, new og2(f72.f4517a, "video/webm", r1Var.f8503b));
                    return;
                }
                return;
            }
            if (i6 == 28032) {
                i(i6);
                y4 y4Var4 = this.f11167v;
                if (y4Var4.h && y4Var4.f10833i != null) {
                    throw rn.a(null, "Combining encryption and compression is not supported");
                }
                return;
            }
            if (i6 == 357149030) {
                if (this.s == -9223372036854775807L) {
                    this.s = 1000000L;
                }
                long j8 = this.f11165t;
                if (j8 != -9223372036854775807L) {
                    this.f11166u = g(j8);
                    return;
                }
                return;
            }
            if (i6 == 374648427) {
                if (sparseArray.size() == 0) {
                    throw rn.a(null, "No valid tracks were found");
                }
                this.f11149c0.d();
                return;
            }
            if (i6 != 475249515) {
                return;
            }
            if (!this.f11168w) {
                z0 z0Var = this.f11149c0;
                gt0 gt0Var = this.D;
                gt0 gt0Var2 = this.E;
                if (this.f11164r == -1 || this.f11166u == -9223372036854775807L || gt0Var == null || (i16 = gt0Var.f5156a) == 0 || gt0Var2 == null || gt0Var2.f5156a != i16) {
                    l1Var = new l1(this.f11166u, 0L);
                } else {
                    int[] iArrCopyOf = new int[i16];
                    long[] jArrCopyOf = new long[i16];
                    long[] jArrCopyOf2 = new long[i16];
                    long[] jArrCopyOf3 = new long[i16];
                    for (int i25 = 0; i25 < i16; i25++) {
                        jArrCopyOf3[i25] = gt0Var.a(i25);
                        jArrCopyOf[i25] = gt0Var2.a(i25) + this.f11164r;
                    }
                    int i26 = 0;
                    while (true) {
                        i17 = i16 - 1;
                        if (i26 >= i17) {
                            break;
                        }
                        int i27 = i26 + 1;
                        iArrCopyOf[i26] = (int) (jArrCopyOf[i27] - jArrCopyOf[i26]);
                        jArrCopyOf2[i26] = jArrCopyOf3[i27] - jArrCopyOf3[i26];
                        i26 = i27;
                    }
                    iArrCopyOf[i17] = (int) ((this.f11164r + this.f11163q) - jArrCopyOf[i17]);
                    long j9 = this.f11166u - jArrCopyOf3[i17];
                    jArrCopyOf2[i17] = j9;
                    if (j9 <= 0) {
                        qs0.f("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j9);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i17);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i17);
                    }
                    l1Var = new o0(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                z0Var.f(l1Var);
                this.f11168w = true;
            }
            this.D = null;
            this.E = null;
            return;
        }
        y4 y4Var5 = this.f11167v;
        y5.k(y4Var5);
        String str7 = y4Var5.f10827b;
        if (str7 == null) {
            throw rn.a(null, "CodecId is missing in TrackEntry element");
        }
        Object obj2 = "V_MPEG4/ISO/AP";
        Object obj3 = "V_MPEG4/ISO/SP";
        Object obj4 = "A_MS/ACM";
        Object obj5 = "A_TRUEHD";
        Object obj6 = "A_VORBIS";
        Object obj7 = "A_MPEG/L2";
        Object obj8 = "A_MPEG/L3";
        Object obj9 = "V_MS/VFW/FOURCC";
        Object obj10 = "S_DVBSUB";
        Object obj11 = "V_MPEG4/ISO/ASP";
        Object obj12 = "V_MPEG4/ISO/AVC";
        Object obj13 = "S_VOBSUB";
        Object obj14 = "A_DTS/LOSSLESS";
        Object obj15 = "A_AAC";
        Object obj16 = "A_AC3";
        Object obj17 = "A_DTS";
        Object obj18 = "V_AV1";
        Object obj19 = "V_VP8";
        switch (str7.hashCode()) {
            case -2095576542:
                obj = "V_VP9";
                if (str7.equals(obj2)) {
                    z4Var = this;
                    obj2 = obj2;
                    z0 z0Var2 = z4Var.f11149c0;
                    int i28 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22 = 3;
                    i = 3;
                    i = 3;
                    i = 3;
                    i = 3;
                    i = 3;
                    int i29 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            if (str.equals(obj2)) {
                                c7 = 6;
                                break;
                            } else {
                                c7 = 65535;
                                break;
                            }
                        case -2095575984:
                            if (str.equals(obj3)) {
                                c7 = 4;
                                break;
                            }
                            break;
                        case -1985379776:
                            if (str.equals(obj4)) {
                                c7 = 23;
                                break;
                            }
                            break;
                        case -1784763192:
                            if (str.equals(obj5)) {
                                c7 = 18;
                                break;
                            }
                            break;
                        case -1730367663:
                            if (str.equals(obj6)) {
                                c7 = 11;
                                break;
                            }
                            break;
                        case -1482641358:
                            if (str.equals(obj7)) {
                                c7 = 14;
                                break;
                            }
                            break;
                        case -1482641357:
                            if (str.equals(obj8)) {
                                c7 = 15;
                                break;
                            }
                            break;
                        case -1373388978:
                            if (str.equals(obj9)) {
                                c7 = '\t';
                                break;
                            }
                            break;
                        case -933872740:
                            if (str.equals(obj10)) {
                                c7 = ' ';
                                break;
                            }
                            break;
                        case -538363189:
                            if (str.equals(obj11)) {
                                c7 = 5;
                                break;
                            }
                            break;
                        case -538363109:
                            if (str.equals(obj12)) {
                                c7 = 7;
                                break;
                            }
                            break;
                        case -425012669:
                            if (str.equals(obj13)) {
                                c7 = 30;
                                break;
                            }
                            break;
                        case -356037306:
                            if (str.equals(obj14)) {
                                c7 = 21;
                                break;
                            }
                            break;
                        case 62923557:
                            if (str.equals(obj15)) {
                                c7 = '\r';
                                break;
                            }
                            break;
                        case 62923603:
                            if (str.equals(obj16)) {
                                c7 = 16;
                                break;
                            }
                            break;
                        case 62927045:
                            if (str.equals(obj17)) {
                                c7 = 19;
                                break;
                            }
                            break;
                        case 82318131:
                            if (str.equals(obj18)) {
                                c7 = 2;
                                break;
                            }
                            break;
                        case 82338133:
                            if (str.equals(obj19)) {
                                c7 = 0;
                                break;
                            }
                            break;
                        case 82338134:
                            if (str.equals(obj)) {
                                c7 = 1;
                                break;
                            }
                            break;
                        case 99146302:
                            if (str.equals("S_HDMV/PGS")) {
                                c7 = 31;
                                break;
                            }
                            break;
                        case 444813526:
                            if (str.equals("V_THEORA")) {
                                c7 = '\n';
                                break;
                            }
                            break;
                        case 542569478:
                            if (str.equals("A_DTS/EXPRESS")) {
                                c7 = 20;
                                break;
                            }
                            break;
                        case 635596514:
                            if (str.equals("A_PCM/FLOAT/IEEE")) {
                                c7 = 26;
                                break;
                            }
                            break;
                        case 725948237:
                            if (str.equals("A_PCM/INT/BIG")) {
                                c7 = 25;
                                break;
                            }
                            break;
                        case 725957860:
                            if (str.equals("A_PCM/INT/LIT")) {
                                c7 = 24;
                                break;
                            }
                            break;
                        case 738597099:
                            if (str.equals("S_TEXT/ASS")) {
                                c7 = 28;
                                break;
                            }
                            break;
                        case 855502857:
                            if (str.equals("V_MPEGH/ISO/HEVC")) {
                                c7 = '\b';
                                break;
                            }
                            break;
                        case 1045209816:
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c7 = 29;
                                break;
                            }
                            break;
                        case 1422270023:
                            if (str.equals("S_TEXT/UTF8")) {
                                c7 = 27;
                                break;
                            }
                            break;
                        case 1809237540:
                            if (str.equals("V_MPEG2")) {
                                c7 = 3;
                                break;
                            }
                            break;
                        case 1950749482:
                            if (str.equals("A_EAC3")) {
                                c7 = 17;
                                break;
                            }
                            break;
                        case 1950789798:
                            if (str.equals("A_FLAC")) {
                                c7 = 22;
                                break;
                            }
                            break;
                        case 1951062397:
                            if (str.equals("A_OPUS")) {
                                c7 = '\f';
                                break;
                            }
                            break;
                    }
                    String str8 = "audio/raw";
                    ?? r32 = "audio/x-unknown";
                    switch (c7) {
                        case 0:
                            y4Var = y4Var5;
                            i9 = 2;
                            str8 = "video/x-vnd.on2.vp8";
                            listSingletonList = null;
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null && (u0VarA = u0.a(new ex0(y4Var.O))) != null) {
                                str4 = u0VarA.f9416a;
                                str8 = "video/dolby-vision";
                            }
                            int i30 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                                tk2Var.A = y4Var.P;
                                tk2Var.B = y4Var.R;
                                tk2Var.C = i10;
                                i29 = 1;
                            } else if (bk.g(str8)) {
                                if (y4Var.f10842r == 0) {
                                    int i31 = y4Var.f10840p;
                                    i13 = -1;
                                    if (i31 == -1) {
                                        i31 = y4Var.f10837m;
                                    }
                                    y4Var.f10840p = i31;
                                    int i32 = y4Var.f10841q;
                                    if (i32 == -1) {
                                        i32 = y4Var.f10838n;
                                    }
                                    y4Var.f10841q = i32;
                                } else {
                                    i13 = -1;
                                }
                                float f6 = (y4Var.f10840p == i13 || (i15 = y4Var.f10841q) == i13) ? -1.0f : (y4Var.f10838n * r2) / (y4Var.f10837m * i15);
                                if (y4Var.f10848y) {
                                    if (y4Var.E == -1.0f || y4Var.F == -1.0f || y4Var.G == -1.0f || y4Var.H == -1.0f || y4Var.I == -1.0f || y4Var.J == -1.0f || y4Var.K == -1.0f || y4Var.L == -1.0f || y4Var.M == -1.0f || y4Var.N == -1.0f) {
                                        bArr = null;
                                    } else {
                                        byte[] bArr2 = new byte[25];
                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder.put((byte) 0);
                                        byteBufferOrder.putShort((short) ((y4Var.E * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.F * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.G * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.H * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.I * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.J * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.K * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) ((y4Var.L * 50000.0f) + 0.5f));
                                        byteBufferOrder.putShort((short) (y4Var.M + 0.5f));
                                        byteBufferOrder.putShort((short) (y4Var.N + 0.5f));
                                        byteBufferOrder.putShort((short) y4Var.C);
                                        byteBufferOrder.putShort((short) y4Var.D);
                                        bArr = bArr2;
                                    }
                                    int i33 = y4Var.f10849z;
                                    int i34 = y4Var.B;
                                    int i35 = y4Var.A;
                                    int i36 = y4Var.f10839o;
                                    mb2Var = new mb2(i33, i34, i35, i36, i36, bArr);
                                } else {
                                    mb2Var = null;
                                }
                                String str9 = y4Var.f10826a;
                                if (str9 != null) {
                                    Map map = f11143j0;
                                    int iIntValue = map.containsKey(str9) ? ((Integer) map.get(y4Var.f10826a)).intValue() : i13;
                                    if (y4Var.s == 0 && Float.compare(y4Var.f10843t, 0.0f) == 0 && Float.compare(y4Var.f10844u, 0.0f) == 0) {
                                        if (Float.compare(y4Var.f10845v, 0.0f) == 0) {
                                            i14 = 0;
                                        } else if (Float.compare(y4Var.f10845v, 90.0f) == 0) {
                                            i14 = 90;
                                        } else if (Float.compare(y4Var.f10845v, -180.0f) == 0 || Float.compare(y4Var.f10845v, 180.0f) == 0) {
                                            i14 = 180;
                                        } else if (Float.compare(y4Var.f10845v, -90.0f) == 0) {
                                            i14 = 270;
                                        }
                                        tk2Var.s = y4Var.f10837m;
                                        tk2Var.f9337t = y4Var.f10838n;
                                        tk2Var.f9340w = f6;
                                        tk2Var.f9339v = i14;
                                        tk2Var.f9341x = y4Var.f10846w;
                                        tk2Var.f9342y = y4Var.f10847x;
                                        tk2Var.f9343z = mb2Var;
                                        i29 = i9;
                                    } else {
                                        i14 = iIntValue;
                                        tk2Var.s = y4Var.f10837m;
                                        tk2Var.f9337t = y4Var.f10838n;
                                        tk2Var.f9340w = f6;
                                        tk2Var.f9339v = i14;
                                        tk2Var.f9341x = y4Var.f10846w;
                                        tk2Var.f9342y = y4Var.f10847x;
                                        tk2Var.f9343z = mb2Var;
                                        i29 = i9;
                                    }
                                }
                            } else if (!"application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                throw rn.a(null, "Unexpected MIME type.");
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null && !f11143j0.containsKey(str6)) {
                                tk2Var.f9321b = y4Var.f10826a;
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar = new w(tk2Var);
                            s1 s1VarG = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG;
                            s1VarG.b(wVar);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 1:
                            y4Var = y4Var5;
                            i9 = 2;
                            str8 = "video/x-vnd.on2.vp9";
                            listSingletonList = null;
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                                str4 = u0VarA.f9416a;
                                str8 = "video/dolby-vision";
                                break;
                            }
                            int i302 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                                tk2Var.f9321b = y4Var.f10826a;
                                break;
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2 = new w(tk2Var);
                            s1 s1VarG2 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2;
                            s1VarG2.b(wVar2);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 2:
                            y4Var = y4Var5;
                            i9 = 2;
                            str8 = "video/av01";
                            listSingletonList = null;
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22 = new w(tk2Var);
                            s1 s1VarG22 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22;
                            s1VarG22.b(wVar22);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 3:
                            y4Var = y4Var5;
                            i9 = 2;
                            str8 = "video/mpeg2";
                            listSingletonList = null;
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222 = new w(tk2Var);
                            s1 s1VarG222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222;
                            s1VarG222.b(wVar222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            y4Var = y4Var5;
                            i9 = 2;
                            byte[] bArr3 = y4Var.f10835k;
                            str8 = "video/mp4v-es";
                            listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222 = new w(tk2Var);
                            s1 s1VarG2222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222;
                            s1VarG2222.b(wVar2222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 7:
                            y4Var = y4Var5;
                            i9 = 2;
                            g0 g0VarA = g0.a(new ex0(y4Var.a(y4Var.f10827b)));
                            ArrayList arrayList2 = g0VarA.f4847a;
                            y4Var.Z = g0VarA.f4848b;
                            str2 = g0VarA.f4857l;
                            str3 = "video/avc";
                            list = arrayList2;
                            str4 = str2;
                            list2 = list;
                            str8 = str3;
                            i10 = -1;
                            list3 = list2;
                            i11 = -1;
                            list5 = list3;
                            if (y4Var.O != null) {
                            }
                            int i3022222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222 = new w(tk2Var);
                            s1 s1VarG22222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222;
                            s1VarG22222.b(wVar22222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case '\b':
                            y4Var = y4Var5;
                            i9 = 2;
                            h1 h1VarA = h1.a(new ex0(y4Var.a(y4Var.f10827b)), false, null);
                            List list8 = h1VarA.f5200a;
                            y4Var.Z = h1VarA.f5201b;
                            str2 = h1VarA.f5209k;
                            str3 = "video/hevc";
                            list = list8;
                            str4 = str2;
                            list2 = list;
                            str8 = str3;
                            i10 = -1;
                            list3 = list2;
                            i11 = -1;
                            list5 = list3;
                            if (y4Var.O != null) {
                            }
                            int i30222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222 = new w(tk2Var);
                            s1 s1VarG222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222;
                            s1VarG222222.b(wVar222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case '\t':
                            y4Var = y4Var5;
                            i9 = 2;
                            ex0 ex0Var = new ex0(y4Var.a(y4Var.f10827b));
                            try {
                                ex0Var.k(16);
                                long jB = ex0Var.B();
                                try {
                                    if (jB == 1482049860) {
                                        r32 = 0;
                                        pair = new Pair("video/divx", null);
                                    } else if (jB == 859189832) {
                                        r32 = 0;
                                        pair = new Pair("video/3gpp", null);
                                    } else if (jB != 826496599) {
                                        qs0.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        str5 = null;
                                        pair = new Pair("video/x-unknown", null);
                                        str8 = (String) pair.first;
                                        str4 = str5;
                                        list2 = (List) pair.second;
                                        i10 = -1;
                                        list3 = list2;
                                        i11 = -1;
                                        list5 = list3;
                                        if (y4Var.O != null) {
                                        }
                                        int i302222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                        tk2Var = new tk2();
                                        if (!"audio".equals(bk.h(str8))) {
                                        }
                                        str6 = y4Var.f10826a;
                                        if (str6 != null) {
                                        }
                                        tk2Var.b(i28);
                                        tk2Var.c(str8);
                                        tk2Var.f9331m = i11;
                                        tk2Var.f9323d = y4Var.X;
                                        tk2Var.f9324e = i302222222;
                                        tk2Var.f9333o = list5;
                                        tk2Var.f9327i = str4;
                                        tk2Var.f9334p = y4Var.f10836l;
                                        w wVar2222222 = new w(tk2Var);
                                        s1 s1VarG2222222 = z0Var2.g(y4Var.f10828c, i29);
                                        y4Var.Y = s1VarG2222222;
                                        s1VarG2222222.b(wVar2222222);
                                        sparseArray.put(y4Var.f10828c, y4Var);
                                        break;
                                    } else {
                                        int i37 = ex0Var.f4417b + 20;
                                        byte[] bArr4 = ex0Var.f4416a;
                                        while (true) {
                                            int length = bArr4.length;
                                            if (i37 >= length - 4) {
                                                try {
                                                    throw rn.a(null, "Failed to find FourCC VC1 initialization data");
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    r32 = 0;
                                                    throw rn.a(r32, "Error parsing FourCC private data");
                                                }
                                            }
                                            int i38 = i37 + 1;
                                            if (bArr4[i37] == 0 && bArr4[i38] == 0 && bArr4[i37 + 2] == 1) {
                                                if (bArr4[i37 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr4, i37, length)));
                                                }
                                            }
                                            i37 = i38;
                                        }
                                    }
                                    str5 = null;
                                    str8 = (String) pair.first;
                                    str4 = str5;
                                    list2 = (List) pair.second;
                                    i10 = -1;
                                    list3 = list2;
                                    i11 = -1;
                                    list5 = list3;
                                    if (y4Var.O != null) {
                                    }
                                    int i3022222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                    tk2Var = new tk2();
                                    if (!"audio".equals(bk.h(str8))) {
                                    }
                                    str6 = y4Var.f10826a;
                                    if (str6 != null) {
                                    }
                                    tk2Var.b(i28);
                                    tk2Var.c(str8);
                                    tk2Var.f9331m = i11;
                                    tk2Var.f9323d = y4Var.X;
                                    tk2Var.f9324e = i3022222222;
                                    tk2Var.f9333o = list5;
                                    tk2Var.f9327i = str4;
                                    tk2Var.f9334p = y4Var.f10836l;
                                    w wVar22222222 = new w(tk2Var);
                                    s1 s1VarG22222222 = z0Var2.g(y4Var.f10828c, i29);
                                    y4Var.Y = s1VarG22222222;
                                    s1VarG22222222.b(wVar22222222);
                                    sparseArray.put(y4Var.f10828c, y4Var);
                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                }
                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                r32 = 0;
                            }
                            break;
                        case '\n':
                            y4Var = y4Var5;
                            i9 = 2;
                            str8 = "video/x-unknown";
                            listSingletonList = null;
                            i10 = -1;
                            list7 = listSingletonList;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222 = new w(tk2Var);
                            s1 s1VarG222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222;
                            s1VarG222222222.b(wVar222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 11:
                            y4Var = y4Var5;
                            byte[] bArrA = y4Var.a(str);
                            try {
                                try {
                                    if (bArrA[0] != 2) {
                                        throw rn.a(null, "Error parsing vorbis codec private");
                                    }
                                    int i39 = 1;
                                    int i40 = 0;
                                    while (true) {
                                        int i41 = bArrA[i39];
                                        i39++;
                                        int i42 = i41 & 255;
                                        if (i42 != 255) {
                                            int i43 = i40 + i42;
                                            int i44 = 0;
                                            while (true) {
                                                int i45 = bArrA[i39];
                                                i39++;
                                                int i46 = i45 & 255;
                                                if (i46 != 255) {
                                                    int i47 = i44 + i46;
                                                    if (bArrA[i39] != 1) {
                                                        throw rn.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    byte[] bArr5 = new byte[i43];
                                                    System.arraycopy(bArrA, i39, bArr5, 0, i43);
                                                    int i48 = i39 + i43;
                                                    if (bArrA[i48] != 3) {
                                                        throw rn.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i49 = i48 + i47;
                                                    if (bArrA[i49] != 5) {
                                                        throw rn.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int length2 = bArrA.length - i49;
                                                    byte[] bArr6 = new byte[length2];
                                                    System.arraycopy(bArrA, i49, bArr6, 0, length2);
                                                    i9 = 2;
                                                    ArrayList arrayList3 = new ArrayList(2);
                                                    arrayList3.add(bArr5);
                                                    arrayList3.add(bArr6);
                                                    i11 = 8192;
                                                    str8 = "audio/vorbis";
                                                    i10 = -1;
                                                    list6 = arrayList3;
                                                    str4 = null;
                                                    list5 = list6;
                                                    if (y4Var.O != null) {
                                                    }
                                                    int i302222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                                    tk2Var = new tk2();
                                                    if (!"audio".equals(bk.h(str8))) {
                                                    }
                                                    str6 = y4Var.f10826a;
                                                    if (str6 != null) {
                                                    }
                                                    tk2Var.b(i28);
                                                    tk2Var.c(str8);
                                                    tk2Var.f9331m = i11;
                                                    tk2Var.f9323d = y4Var.X;
                                                    tk2Var.f9324e = i302222222222;
                                                    tk2Var.f9333o = list5;
                                                    tk2Var.f9327i = str4;
                                                    tk2Var.f9334p = y4Var.f10836l;
                                                    w wVar2222222222 = new w(tk2Var);
                                                    s1 s1VarG2222222222 = z0Var2.g(y4Var.f10828c, i29);
                                                    y4Var.Y = s1VarG2222222222;
                                                    s1VarG2222222222.b(wVar2222222222);
                                                    sparseArray.put(y4Var.f10828c, y4Var);
                                                    break;
                                                } else {
                                                    i44 += 255;
                                                }
                                            }
                                        } else {
                                            i40 += 255;
                                        }
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                    throw rn.a(r22, "Error parsing vorbis codec private");
                                }
                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                r22 = 0;
                            }
                            break;
                        case '\f':
                            y4Var = y4Var5;
                            ArrayList arrayList4 = new ArrayList(3);
                            arrayList4.add(y4Var.a(y4Var.f10827b));
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(y4Var.S).array());
                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(y4Var.T).array());
                            i11 = 5760;
                            str8 = "audio/opus";
                            arrayList = arrayList4;
                            i10 = -1;
                            i9 = 2;
                            list6 = arrayList;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222 = new w(tk2Var);
                            s1 s1VarG22222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222;
                            s1VarG22222222222.b(wVar22222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case '\r':
                            y4Var = y4Var5;
                            List listSingletonList3 = Collections.singletonList(y4Var.a(str));
                            byte[] bArr7 = y4Var.f10835k;
                            b0 b0VarA = c0.a(new l42(bArr7.length, bArr7), false);
                            y4Var.R = b0VarA.f2880a;
                            y4Var.P = b0VarA.f2881b;
                            str4 = b0VarA.f2882c;
                            str8 = "audio/mp4a-latm";
                            i10 = -1;
                            i9 = 2;
                            list3 = listSingletonList3;
                            i11 = -1;
                            list5 = list3;
                            if (y4Var.O != null) {
                            }
                            int i30222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222222 = new w(tk2Var);
                            s1 s1VarG222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222222;
                            s1VarG222222222222.b(wVar222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 14:
                            y4Var = y4Var5;
                            i12 = 4096;
                            str8 = "audio/mpeg-L2";
                            i11 = i12;
                            arrayList = null;
                            i10 = -1;
                            i9 = 2;
                            list6 = arrayList;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222;
                            s1VarG2222222222222.b(wVar2222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 15:
                            y4Var = y4Var5;
                            i12 = 4096;
                            str8 = "audio/mpeg";
                            i11 = i12;
                            arrayList = null;
                            i10 = -1;
                            i9 = 2;
                            list6 = arrayList;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222;
                            s1VarG22222222222222.b(wVar22222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 16:
                            y4Var = y4Var5;
                            str8 = "audio/ac3";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222222222 = new w(tk2Var);
                            s1 s1VarG222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222222222;
                            s1VarG222222222222222.b(wVar222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 17:
                            y4Var = y4Var5;
                            str8 = "audio/eac3";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222222;
                            s1VarG2222222222222222.b(wVar2222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 18:
                            y4Var = y4Var5;
                            y4Var.U = new t1();
                            str8 = "audio/true-hd";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222222;
                            s1VarG22222222222222222.b(wVar22222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 19:
                        case 20:
                            y4Var = y4Var5;
                            str8 = "audio/vnd.dts";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222222222222 = new w(tk2Var);
                            s1 s1VarG222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222222222222;
                            s1VarG222222222222222222.b(wVar222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case dn.zzm /* 21 */:
                            y4Var = y4Var5;
                            str8 = "audio/vnd.dts.hd";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222222222;
                            s1VarG2222222222222222222.b(wVar2222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 22:
                            y4Var = y4Var5;
                            str8 = "audio/flac";
                            listSingletonList2 = Collections.singletonList(y4Var.a(str));
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222222222;
                            s1VarG22222222222222222222.b(wVar22222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 23:
                            y4Var = y4Var5;
                            ex0 ex0Var2 = new ex0(y4Var.a(y4Var.f10827b));
                            try {
                                int iT = ex0Var2.t();
                                if (iT != 1) {
                                    if (iT == 65534) {
                                        ex0Var2.j(24);
                                        long jC = ex0Var2.C();
                                        UUID uuid = f11142i0;
                                        if (jC == uuid.getMostSignificantBits()) {
                                            if (ex0Var2.C() == uuid.getLeastSignificantBits()) {
                                            }
                                            str8 = "audio/x-unknown";
                                            listSingletonList2 = null;
                                            i10 = -1;
                                            list4 = listSingletonList2;
                                            i9 = 2;
                                            list7 = list4;
                                            i11 = -1;
                                            list6 = list7;
                                            str4 = null;
                                            list5 = list6;
                                            if (y4Var.O != null) {
                                            }
                                            int i30222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                            tk2Var = new tk2();
                                            if (!"audio".equals(bk.h(str8))) {
                                            }
                                            str6 = y4Var.f10826a;
                                            if (str6 != null) {
                                            }
                                            tk2Var.b(i28);
                                            tk2Var.c(str8);
                                            tk2Var.f9331m = i11;
                                            tk2Var.f9323d = y4Var.X;
                                            tk2Var.f9324e = i30222222222222222222222;
                                            tk2Var.f9333o = list5;
                                            tk2Var.f9327i = str4;
                                            tk2Var.f9334p = y4Var.f10836l;
                                            w wVar222222222222222222222 = new w(tk2Var);
                                            s1 s1VarG222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                            y4Var.Y = s1VarG222222222222222222222;
                                            s1VarG222222222222222222222.b(wVar222222222222222222222);
                                            sparseArray.put(y4Var.f10828c, y4Var);
                                            break;
                                        }
                                    }
                                    qs0.f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList2 = null;
                                    i10 = -1;
                                    list4 = listSingletonList2;
                                    i9 = 2;
                                    list7 = list4;
                                    i11 = -1;
                                    list6 = list7;
                                    str4 = null;
                                    list5 = list6;
                                    if (y4Var.O != null) {
                                    }
                                    int i302222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                    tk2Var = new tk2();
                                    if (!"audio".equals(bk.h(str8))) {
                                    }
                                    str6 = y4Var.f10826a;
                                    if (str6 != null) {
                                    }
                                    tk2Var.b(i28);
                                    tk2Var.c(str8);
                                    tk2Var.f9331m = i11;
                                    tk2Var.f9323d = y4Var.X;
                                    tk2Var.f9324e = i302222222222222222222222;
                                    tk2Var.f9333o = list5;
                                    tk2Var.f9327i = str4;
                                    tk2Var.f9334p = y4Var.f10836l;
                                    w wVar2222222222222222222222 = new w(tk2Var);
                                    s1 s1VarG2222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                    y4Var.Y = s1VarG2222222222222222222222;
                                    s1VarG2222222222222222222222.b(wVar2222222222222222222222);
                                    sparseArray.put(y4Var.f10828c, y4Var);
                                }
                                iQ = j31.q(y4Var.Q);
                                if (iQ == 0) {
                                    qs0.f("MatroskaExtractor", "Unsupported PCM bit depth: " + y4Var.Q + ". Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList2 = null;
                                    i10 = -1;
                                    list4 = listSingletonList2;
                                    i9 = 2;
                                    list7 = list4;
                                    i11 = -1;
                                    list6 = list7;
                                    str4 = null;
                                    list5 = list6;
                                    if (y4Var.O != null) {
                                    }
                                    int i3022222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                    tk2Var = new tk2();
                                    if (!"audio".equals(bk.h(str8))) {
                                    }
                                    str6 = y4Var.f10826a;
                                    if (str6 != null) {
                                    }
                                    tk2Var.b(i28);
                                    tk2Var.c(str8);
                                    tk2Var.f9331m = i11;
                                    tk2Var.f9323d = y4Var.X;
                                    tk2Var.f9324e = i3022222222222222222222222;
                                    tk2Var.f9333o = list5;
                                    tk2Var.f9327i = str4;
                                    tk2Var.f9334p = y4Var.f10836l;
                                    w wVar22222222222222222222222 = new w(tk2Var);
                                    s1 s1VarG22222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                    y4Var.Y = s1VarG22222222222222222222222;
                                    s1VarG22222222222222222222222.b(wVar22222222222222222222222);
                                    sparseArray.put(y4Var.f10828c, y4Var);
                                }
                                i10 = iQ;
                                list4 = null;
                                i9 = 2;
                                list7 = list4;
                                i11 = -1;
                                list6 = list7;
                                str4 = null;
                                list5 = list6;
                                if (y4Var.O != null) {
                                }
                                int i30222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                tk2Var = new tk2();
                                if (!"audio".equals(bk.h(str8))) {
                                }
                                str6 = y4Var.f10826a;
                                if (str6 != null) {
                                }
                                tk2Var.b(i28);
                                tk2Var.c(str8);
                                tk2Var.f9331m = i11;
                                tk2Var.f9323d = y4Var.X;
                                tk2Var.f9324e = i30222222222222222222222222;
                                tk2Var.f9333o = list5;
                                tk2Var.f9327i = str4;
                                tk2Var.f9334p = y4Var.f10836l;
                                w wVar222222222222222222222222 = new w(tk2Var);
                                s1 s1VarG222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                y4Var.Y = s1VarG222222222222222222222222;
                                s1VarG222222222222222222222222.b(wVar222222222222222222222222);
                                sparseArray.put(y4Var.f10828c, y4Var);
                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                throw rn.a(null, "Error parsing MS/ACM codec private");
                            }
                            break;
                        case 24:
                            y4Var = y4Var5;
                            iQ = j31.q(y4Var.Q);
                            if (iQ == 0) {
                                qs0.f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + y4Var.Q + ". Setting mimeType to audio/x-unknown");
                                str8 = "audio/x-unknown";
                                listSingletonList2 = null;
                                i10 = -1;
                                list4 = listSingletonList2;
                                i9 = 2;
                                list7 = list4;
                                i11 = -1;
                                list6 = list7;
                                str4 = null;
                                list5 = list6;
                                if (y4Var.O != null) {
                                }
                                int i302222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                tk2Var = new tk2();
                                if (!"audio".equals(bk.h(str8))) {
                                }
                                str6 = y4Var.f10826a;
                                if (str6 != null) {
                                }
                                tk2Var.b(i28);
                                tk2Var.c(str8);
                                tk2Var.f9331m = i11;
                                tk2Var.f9323d = y4Var.X;
                                tk2Var.f9324e = i302222222222222222222222222;
                                tk2Var.f9333o = list5;
                                tk2Var.f9327i = str4;
                                tk2Var.f9334p = y4Var.f10836l;
                                w wVar2222222222222222222222222 = new w(tk2Var);
                                s1 s1VarG2222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                y4Var.Y = s1VarG2222222222222222222222222;
                                s1VarG2222222222222222222222222.b(wVar2222222222222222222222222);
                                sparseArray.put(y4Var.f10828c, y4Var);
                                break;
                            }
                            i10 = iQ;
                            list4 = null;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222222222222222;
                            s1VarG22222222222222222222222222.b(wVar22222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 25:
                            y4Var = y4Var5;
                            int i50 = y4Var.Q;
                            if (i50 == 8) {
                                i10 = 3;
                                list4 = null;
                                i9 = 2;
                                list7 = list4;
                                i11 = -1;
                                list6 = list7;
                                str4 = null;
                                list5 = list6;
                                if (y4Var.O != null) {
                                }
                                int i30222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                tk2Var = new tk2();
                                if (!"audio".equals(bk.h(str8))) {
                                }
                                str6 = y4Var.f10826a;
                                if (str6 != null) {
                                }
                                tk2Var.b(i28);
                                tk2Var.c(str8);
                                tk2Var.f9331m = i11;
                                tk2Var.f9323d = y4Var.X;
                                tk2Var.f9324e = i30222222222222222222222222222;
                                tk2Var.f9333o = list5;
                                tk2Var.f9327i = str4;
                                tk2Var.f9334p = y4Var.f10836l;
                                w wVar222222222222222222222222222 = new w(tk2Var);
                                s1 s1VarG222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                y4Var.Y = s1VarG222222222222222222222222222;
                                s1VarG222222222222222222222222222.b(wVar222222222222222222222222222);
                                sparseArray.put(y4Var.f10828c, y4Var);
                                break;
                            } else {
                                if (i50 == 16) {
                                    iQ = 268435456;
                                } else if (i50 == 24) {
                                    iQ = 1342177280;
                                } else if (i50 == 32) {
                                    iQ = 1610612736;
                                } else {
                                    qs0.f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i50 + ". Setting mimeType to audio/x-unknown");
                                    str8 = "audio/x-unknown";
                                    listSingletonList2 = null;
                                    i10 = -1;
                                    list4 = listSingletonList2;
                                    i9 = 2;
                                    list7 = list4;
                                    i11 = -1;
                                    list6 = list7;
                                    str4 = null;
                                    list5 = list6;
                                    if (y4Var.O != null) {
                                    }
                                    int i302222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                    tk2Var = new tk2();
                                    if (!"audio".equals(bk.h(str8))) {
                                    }
                                    str6 = y4Var.f10826a;
                                    if (str6 != null) {
                                    }
                                    tk2Var.b(i28);
                                    tk2Var.c(str8);
                                    tk2Var.f9331m = i11;
                                    tk2Var.f9323d = y4Var.X;
                                    tk2Var.f9324e = i302222222222222222222222222222;
                                    tk2Var.f9333o = list5;
                                    tk2Var.f9327i = str4;
                                    tk2Var.f9334p = y4Var.f10836l;
                                    w wVar2222222222222222222222222222 = new w(tk2Var);
                                    s1 s1VarG2222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                    y4Var.Y = s1VarG2222222222222222222222222222;
                                    s1VarG2222222222222222222222222222.b(wVar2222222222222222222222222222);
                                    sparseArray.put(y4Var.f10828c, y4Var);
                                }
                                i10 = iQ;
                                list4 = null;
                                i9 = 2;
                                list7 = list4;
                                i11 = -1;
                                list6 = list7;
                                str4 = null;
                                list5 = list6;
                                if (y4Var.O != null) {
                                }
                                int i3022222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                tk2Var = new tk2();
                                if (!"audio".equals(bk.h(str8))) {
                                }
                                str6 = y4Var.f10826a;
                                if (str6 != null) {
                                }
                                tk2Var.b(i28);
                                tk2Var.c(str8);
                                tk2Var.f9331m = i11;
                                tk2Var.f9323d = y4Var.X;
                                tk2Var.f9324e = i3022222222222222222222222222222;
                                tk2Var.f9333o = list5;
                                tk2Var.f9327i = str4;
                                tk2Var.f9334p = y4Var.f10836l;
                                w wVar22222222222222222222222222222 = new w(tk2Var);
                                s1 s1VarG22222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                y4Var.Y = s1VarG22222222222222222222222222222;
                                s1VarG22222222222222222222222222222.b(wVar22222222222222222222222222222);
                                sparseArray.put(y4Var.f10828c, y4Var);
                            }
                            break;
                        case 26:
                            y4Var = y4Var5;
                            iQ = 4;
                            int i51 = y4Var.Q;
                            if (i51 != 32) {
                                qs0.f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i51 + ". Setting mimeType to audio/x-unknown");
                                str8 = "audio/x-unknown";
                                listSingletonList2 = null;
                                i10 = -1;
                                list4 = listSingletonList2;
                                i9 = 2;
                                list7 = list4;
                                i11 = -1;
                                list6 = list7;
                                str4 = null;
                                list5 = list6;
                                if (y4Var.O != null) {
                                }
                                int i30222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                                tk2Var = new tk2();
                                if (!"audio".equals(bk.h(str8))) {
                                }
                                str6 = y4Var.f10826a;
                                if (str6 != null) {
                                }
                                tk2Var.b(i28);
                                tk2Var.c(str8);
                                tk2Var.f9331m = i11;
                                tk2Var.f9323d = y4Var.X;
                                tk2Var.f9324e = i30222222222222222222222222222222;
                                tk2Var.f9333o = list5;
                                tk2Var.f9327i = str4;
                                tk2Var.f9334p = y4Var.f10836l;
                                w wVar222222222222222222222222222222 = new w(tk2Var);
                                s1 s1VarG222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                                y4Var.Y = s1VarG222222222222222222222222222222;
                                s1VarG222222222222222222222222222222.b(wVar222222222222222222222222222222);
                                sparseArray.put(y4Var.f10828c, y4Var);
                                break;
                            }
                            i10 = iQ;
                            list4 = null;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222222222222222222222;
                            s1VarG2222222222222222222222222222222.b(wVar2222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 27:
                            y4Var = y4Var5;
                            str8 = "application/x-subrip";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222222222222222222222;
                            s1VarG22222222222222222222222222222222.b(wVar22222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 28:
                            y4Var = y4Var5;
                            str8 = "text/x-ssa";
                            listSingletonList2 = bo1.o(f11139f0, y4Var.a(y4Var.f10827b));
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG222222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222222222222222222222222222;
                            s1VarG222222222222222222222222222222222.b(wVar222222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 29:
                            y4Var = y4Var5;
                            str8 = "text/vtt";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222222222222222222222222;
                            s1VarG2222222222222222222222222222222222.b(wVar2222222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 30:
                            y4Var = y4Var5;
                            str8 = "application/vobsub";
                            listSingletonList2 = bo1.n(y4Var.a(str));
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i3022222222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i3022222222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar22222222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG22222222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG22222222222222222222222222222222222;
                            s1VarG22222222222222222222222222222222222.b(wVar22222222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case 31:
                            y4Var = y4Var5;
                            str8 = "application/pgs";
                            listSingletonList2 = null;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i30222222222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i30222222222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar222222222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG222222222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG222222222222222222222222222222222222;
                            s1VarG222222222222222222222222222222222222.b(wVar222222222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        case ' ':
                            byte[] bArr8 = new byte[4];
                            y4Var = y4Var5;
                            System.arraycopy(y4Var.a(str), 0, bArr8, 0, 4);
                            cp1 cp1VarN = bo1.n(bArr8);
                            str8 = "application/dvbsubs";
                            listSingletonList2 = cp1VarN;
                            i10 = -1;
                            list4 = listSingletonList2;
                            i9 = 2;
                            list7 = list4;
                            i11 = -1;
                            list6 = list7;
                            str4 = null;
                            list5 = list6;
                            if (y4Var.O != null) {
                            }
                            int i302222222222222222222222222222222222222 = (y4Var.W ? 1 : 0) | (true == y4Var.V ? 0 : i9);
                            tk2Var = new tk2();
                            if (!"audio".equals(bk.h(str8))) {
                            }
                            str6 = y4Var.f10826a;
                            if (str6 != null) {
                            }
                            tk2Var.b(i28);
                            tk2Var.c(str8);
                            tk2Var.f9331m = i11;
                            tk2Var.f9323d = y4Var.X;
                            tk2Var.f9324e = i302222222222222222222222222222222222222;
                            tk2Var.f9333o = list5;
                            tk2Var.f9327i = str4;
                            tk2Var.f9334p = y4Var.f10836l;
                            w wVar2222222222222222222222222222222222222 = new w(tk2Var);
                            s1 s1VarG2222222222222222222222222222222222222 = z0Var2.g(y4Var.f10828c, i29);
                            y4Var.Y = s1VarG2222222222222222222222222222222222222;
                            s1VarG2222222222222222222222222222222222222.b(wVar2222222222222222222222222222222222222);
                            sparseArray.put(y4Var.f10828c, y4Var);
                            break;
                        default:
                            throw rn.a(null, "Unrecognized codec identifier.");
                    }
                }
                this.f11167v = null;
                return;
            case -2095575984:
                obj = "V_VP9";
                if (str7.equals(obj3)) {
                    z4Var = this;
                    obj3 = obj3;
                    z0 z0Var22 = z4Var.f11149c0;
                    int i282 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222 = 3;
                    i29 = 3;
                    i29 = 3;
                    i29 = 3;
                    i29 = 3;
                    i29 = 3;
                    int i292 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82 = "audio/raw";
                    ?? r322 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1985379776:
                obj = "V_VP9";
                if (str7.equals(obj4)) {
                    z4Var = this;
                    obj4 = obj4;
                    z0 z0Var222 = z4Var.f11149c0;
                    int i2822 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222 = 3;
                    i292 = 3;
                    i292 = 3;
                    i292 = 3;
                    i292 = 3;
                    i292 = 3;
                    int i2922 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822 = "audio/raw";
                    ?? r3222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1784763192:
                obj = "V_VP9";
                if (str7.equals(obj5)) {
                    z4Var = this;
                    obj5 = obj5;
                    z0 z0Var2222 = z4Var.f11149c0;
                    int i28222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22222 = 3;
                    i2922 = 3;
                    i2922 = 3;
                    i2922 = 3;
                    i2922 = 3;
                    i2922 = 3;
                    int i29222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str8222 = "audio/raw";
                    ?? r32222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1730367663:
                obj = "V_VP9";
                if (str7.equals(obj6)) {
                    z4Var = this;
                    obj6 = obj6;
                    z0 z0Var22222 = z4Var.f11149c0;
                    int i282222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222222 = 3;
                    i29222 = 3;
                    i29222 = 3;
                    i29222 = 3;
                    i29222 = 3;
                    i29222 = 3;
                    int i292222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82222 = "audio/raw";
                    ?? r322222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1482641358:
                obj = "V_VP9";
                if (str7.equals(obj7)) {
                    z4Var = this;
                    obj7 = obj7;
                    z0 z0Var222222 = z4Var.f11149c0;
                    int i2822222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222222 = 3;
                    i292222 = 3;
                    i292222 = 3;
                    i292222 = 3;
                    i292222 = 3;
                    i292222 = 3;
                    int i2922222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822222 = "audio/raw";
                    ?? r3222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1482641357:
                obj = "V_VP9";
                if (str7.equals(obj8)) {
                    z4Var = this;
                    obj8 = obj8;
                    z0 z0Var2222222 = z4Var.f11149c0;
                    int i28222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22222222 = 3;
                    i2922222 = 3;
                    i2922222 = 3;
                    i2922222 = 3;
                    i2922222 = 3;
                    i2922222 = 3;
                    int i29222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str8222222 = "audio/raw";
                    ?? r32222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -1373388978:
                obj = "V_VP9";
                if (str7.equals(obj9)) {
                    z4Var = this;
                    obj9 = obj9;
                    z0 z0Var22222222 = z4Var.f11149c0;
                    int i282222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222222222 = 3;
                    i29222222 = 3;
                    i29222222 = 3;
                    i29222222 = 3;
                    i29222222 = 3;
                    i29222222 = 3;
                    int i292222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82222222 = "audio/raw";
                    ?? r322222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -933872740:
                obj = "V_VP9";
                if (str7.equals(obj10)) {
                    z4Var = this;
                    obj10 = obj10;
                    z0 z0Var222222222 = z4Var.f11149c0;
                    int i2822222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222222222 = 3;
                    i292222222 = 3;
                    i292222222 = 3;
                    i292222222 = 3;
                    i292222222 = 3;
                    i292222222 = 3;
                    int i2922222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822222222 = "audio/raw";
                    ?? r3222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -538363189:
                obj = "V_VP9";
                if (str7.equals(obj11)) {
                    z4Var = this;
                    obj11 = obj11;
                    z0 z0Var2222222222 = z4Var.f11149c0;
                    int i28222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22222222222 = 3;
                    i2922222222 = 3;
                    i2922222222 = 3;
                    i2922222222 = 3;
                    i2922222222 = 3;
                    i2922222222 = 3;
                    int i29222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str8222222222 = "audio/raw";
                    ?? r32222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -538363109:
                obj = "V_VP9";
                if (str7.equals(obj12)) {
                    z4Var = this;
                    obj12 = obj12;
                    z0 z0Var22222222222 = z4Var.f11149c0;
                    int i282222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222222222222 = 3;
                    i29222222222 = 3;
                    i29222222222 = 3;
                    i29222222222 = 3;
                    i29222222222 = 3;
                    i29222222222 = 3;
                    int i292222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82222222222 = "audio/raw";
                    ?? r322222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -425012669:
                obj = "V_VP9";
                if (str7.equals(obj13)) {
                    z4Var = this;
                    obj13 = obj13;
                    z0 z0Var222222222222 = z4Var.f11149c0;
                    int i2822222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222222222222 = 3;
                    i292222222222 = 3;
                    i292222222222 = 3;
                    i292222222222 = 3;
                    i292222222222 = 3;
                    i292222222222 = 3;
                    int i2922222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822222222222 = "audio/raw";
                    ?? r3222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case -356037306:
                obj = "V_VP9";
                if (str7.equals(obj14)) {
                    z4Var = this;
                    obj14 = obj14;
                    z0 z0Var2222222222222 = z4Var.f11149c0;
                    int i28222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22222222222222 = 3;
                    i2922222222222 = 3;
                    i2922222222222 = 3;
                    i2922222222222 = 3;
                    i2922222222222 = 3;
                    i2922222222222 = 3;
                    int i29222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str8222222222222 = "audio/raw";
                    ?? r32222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 62923557:
                obj = "V_VP9";
                if (str7.equals(obj15)) {
                    z4Var = this;
                    obj15 = obj15;
                    z0 z0Var22222222222222 = z4Var.f11149c0;
                    int i282222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222222222222222 = 3;
                    i29222222222222 = 3;
                    i29222222222222 = 3;
                    i29222222222222 = 3;
                    i29222222222222 = 3;
                    i29222222222222 = 3;
                    int i292222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82222222222222 = "audio/raw";
                    ?? r322222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 62923603:
                obj = "V_VP9";
                if (str7.equals(obj16)) {
                    z4Var = this;
                    obj16 = obj16;
                    z0 z0Var222222222222222 = z4Var.f11149c0;
                    int i2822222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222222222222222 = 3;
                    i292222222222222 = 3;
                    i292222222222222 = 3;
                    i292222222222222 = 3;
                    i292222222222222 = 3;
                    i292222222222222 = 3;
                    int i2922222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822222222222222 = "audio/raw";
                    ?? r3222222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 62927045:
                obj = "V_VP9";
                if (str7.equals(obj17)) {
                    z4Var = this;
                    obj17 = obj17;
                    z0 z0Var2222222222222222 = z4Var.f11149c0;
                    int i28222222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r22222222222222222 = 3;
                    i2922222222222222 = 3;
                    i2922222222222222 = 3;
                    i2922222222222222 = 3;
                    i2922222222222222 = 3;
                    i2922222222222222 = 3;
                    int i29222222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str8222222222222222 = "audio/raw";
                    ?? r32222222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 82318131:
                obj = "V_VP9";
                if (str7.equals(obj18)) {
                    z4Var = this;
                    obj18 = obj18;
                    z0 z0Var22222222222222222 = z4Var.f11149c0;
                    int i282222222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r222222222222222222 = 3;
                    i29222222222222222 = 3;
                    i29222222222222222 = 3;
                    i29222222222222222 = 3;
                    i29222222222222222 = 3;
                    i29222222222222222 = 3;
                    int i292222222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str82222222222222222 = "audio/raw";
                    ?? r322222222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 82338133:
                obj = "V_VP9";
                if (str7.equals(obj19)) {
                    z4Var = this;
                    obj19 = obj19;
                    z0 z0Var222222222222222222 = z4Var.f11149c0;
                    int i2822222222222222222 = y4Var5.f10828c;
                    str = y4Var5.f10827b;
                    ?? r2222222222222222222 = 3;
                    i292222222222222222 = 3;
                    i292222222222222222 = 3;
                    i292222222222222222 = 3;
                    i292222222222222222 = 3;
                    i292222222222222222 = 3;
                    int i2922222222222222222 = 3;
                    switch (str.hashCode()) {
                        case -2095576542:
                            break;
                        case -2095575984:
                            break;
                        case -1985379776:
                            break;
                        case -1784763192:
                            break;
                        case -1730367663:
                            break;
                        case -1482641358:
                            break;
                        case -1482641357:
                            break;
                        case -1373388978:
                            break;
                        case -933872740:
                            break;
                        case -538363189:
                            break;
                        case -538363109:
                            break;
                        case -425012669:
                            break;
                        case -356037306:
                            break;
                        case 62923557:
                            break;
                        case 62923603:
                            break;
                        case 62927045:
                            break;
                        case 82318131:
                            break;
                        case 82338133:
                            break;
                        case 82338134:
                            break;
                        case 99146302:
                            break;
                        case 444813526:
                            break;
                        case 542569478:
                            break;
                        case 635596514:
                            break;
                        case 725948237:
                            break;
                        case 725957860:
                            break;
                        case 738597099:
                            break;
                        case 855502857:
                            break;
                        case 1045209816:
                            break;
                        case 1422270023:
                            break;
                        case 1809237540:
                            break;
                        case 1950749482:
                            break;
                        case 1950789798:
                            break;
                        case 1951062397:
                            break;
                    }
                    String str822222222222222222 = "audio/raw";
                    ?? r3222222222222222222 = "audio/x-unknown";
                    switch (c7) {
                    }
                }
                this.f11167v = null;
                return;
            case 82338134:
                break;
            case 99146302:
                break;
            case 444813526:
                break;
            case 542569478:
                break;
            case 635596514:
                break;
            case 725948237:
                break;
            case 725957860:
                break;
            case 738597099:
                break;
            case 855502857:
                break;
            case 1045209816:
                break;
            case 1422270023:
                break;
            case 1809237540:
                break;
            case 1950749482:
                break;
            case 1950789798:
                break;
            case 1951062397:
                break;
            default:
                this.f11167v = null;
                return;
        }
    }

    public final int b(y0 y0Var, y4 y4Var, int i6, boolean z6) throws rn {
        int iD;
        int iD2;
        int i7;
        if ("S_TEXT/UTF8".equals(y4Var.f10827b)) {
            m(y0Var, f11138e0, i6);
            int i8 = this.U;
            l();
            return i8;
        }
        if ("S_TEXT/ASS".equals(y4Var.f10827b)) {
            m(y0Var, f11140g0, i6);
            int i9 = this.U;
            l();
            return i9;
        }
        if ("S_TEXT/WEBVTT".equals(y4Var.f10827b)) {
            m(y0Var, f11141h0, i6);
            int i10 = this.U;
            l();
            return i10;
        }
        s1 s1Var = y4Var.Y;
        boolean z7 = this.W;
        ex0 ex0Var = this.f11157k;
        if (!z7) {
            boolean z8 = y4Var.h;
            ex0 ex0Var2 = this.h;
            if (z8) {
                this.P &= -1073741825;
                if (!this.X) {
                    y0Var.i(0, 1, ex0Var2.f4416a);
                    this.T++;
                    byte b7 = ex0Var2.f4416a[0];
                    if ((b7 & 128) == 128) {
                        throw rn.a(null, "Extension bit is set in signal byte");
                    }
                    this.f11145a0 = b7;
                    this.X = true;
                }
                byte b8 = this.f11145a0;
                if ((b8 & 1) == 1) {
                    int i11 = b8 & 2;
                    this.P |= 1073741824;
                    if (!this.f11147b0) {
                        ex0 ex0Var3 = this.f11159m;
                        y0Var.i(0, 8, ex0Var3.f4416a);
                        this.T += 8;
                        this.f11147b0 = true;
                        ex0Var2.f4416a[0] = (byte) ((i11 != 2 ? 0 : 128) | 8);
                        ex0Var2.j(0);
                        s1Var.f(ex0Var2, 1, 1);
                        this.U++;
                        ex0Var3.j(0);
                        s1Var.f(ex0Var3, 8, 1);
                        this.U += 8;
                    }
                    if (i11 == 2) {
                        if (!this.Y) {
                            y0Var.i(0, 1, ex0Var2.f4416a);
                            this.T++;
                            ex0Var2.j(0);
                            this.Z = ex0Var2.v();
                            this.Y = true;
                        }
                        int i12 = this.Z * 4;
                        ex0Var2.g(i12);
                        y0Var.i(0, i12, ex0Var2.f4416a);
                        this.T += i12;
                        int i13 = (this.Z >> 1) + 1;
                        int i14 = (i13 * 6) + 2;
                        ByteBuffer byteBuffer = this.f11162p;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f11162p = ByteBuffer.allocate(i14);
                        }
                        this.f11162p.position(0);
                        this.f11162p.putShort((short) i13);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i7 = this.Z;
                            if (i15 >= i7) {
                                break;
                            }
                            int iY = ex0Var2.y();
                            int i17 = iY - i16;
                            if (i15 % 2 == 0) {
                                this.f11162p.putShort((short) i17);
                            } else {
                                this.f11162p.putInt(i17);
                            }
                            i15++;
                            i16 = iY;
                        }
                        int i18 = (i6 - this.T) - i16;
                        if ((i7 & 1) == 1) {
                            this.f11162p.putInt(i18);
                        } else {
                            this.f11162p.putShort((short) i18);
                            this.f11162p.putInt(0);
                        }
                        byte[] bArrArray = this.f11162p.array();
                        ex0 ex0Var4 = this.f11160n;
                        ex0Var4.h(i14, bArrArray);
                        s1Var.f(ex0Var4, i14, 1);
                        this.U += i14;
                    }
                }
            } else {
                byte[] bArr = y4Var.f10833i;
                if (bArr != null) {
                    ex0Var.h(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(y4Var.f10827b) ? y4Var.f10831f > 0 : z6) {
                this.P |= 268435456;
                this.f11161o.g(0);
                int i19 = (ex0Var.f4418c + i6) - this.T;
                ex0Var2.g(4);
                byte[] bArr2 = ex0Var2.f4416a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                s1Var.f(ex0Var2, 4, 2);
                this.U += 4;
            }
            this.W = true;
        }
        int i20 = i6 + ex0Var.f4418c;
        if (!"V_MPEG4/ISO/AVC".equals(y4Var.f10827b) && !"V_MPEGH/ISO/HEVC".equals(y4Var.f10827b)) {
            if (y4Var.U != null) {
                y5.r(ex0Var.f4418c == 0);
                y4Var.U.c(y0Var);
            }
            while (true) {
                int i21 = this.T;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int iO = ex0Var.o();
                if (iO > 0) {
                    iD2 = Math.min(i22, iO);
                    s1Var.e(iD2, ex0Var);
                } else {
                    iD2 = s1Var.d(y0Var, i22, false);
                }
                this.T += iD2;
                this.U += iD2;
            }
        } else {
            ex0 ex0Var5 = this.f11154g;
            byte[] bArr3 = ex0Var5.f4416a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = y4Var.Z;
            int i24 = 4 - i23;
            while (this.T < i20) {
                int i25 = this.V;
                if (i25 == 0) {
                    int iMin = Math.min(i23, ex0Var.o());
                    y0Var.i(i24 + iMin, i23 - iMin, bArr3);
                    if (iMin > 0) {
                        ex0Var.f(i24, iMin, bArr3);
                    }
                    this.T += i23;
                    ex0Var5.j(0);
                    this.V = ex0Var5.y();
                    ex0 ex0Var6 = this.f11153f;
                    ex0Var6.j(0);
                    s1Var.e(4, ex0Var6);
                    this.U += 4;
                } else {
                    int iO2 = ex0Var.o();
                    if (iO2 > 0) {
                        iD = Math.min(i25, iO2);
                        s1Var.e(iD, ex0Var);
                    } else {
                        iD = s1Var.d(y0Var, i25, false);
                    }
                    this.T += iD;
                    this.U += iD;
                    this.V -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(y4Var.f10827b)) {
            ex0 ex0Var7 = this.f11155i;
            ex0Var7.j(0);
            s1Var.e(4, ex0Var7);
            this.U += 4;
        }
        int i26 = this.U;
        l();
        return i26;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        this.C = -9223372036854775807L;
        this.H = 0;
        x4 x4Var = this.f11151d0;
        x4Var.f10353e = 0;
        x4Var.f10350b.clear();
        b5 b5Var = x4Var.f10351c;
        b5Var.f2917a = 0;
        b5Var.f2918b = 0;
        b5 b5Var2 = this.f11144a;
        b5Var2.f2917a = 0;
        b5Var2.f2918b = 0;
        l();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f11146b;
            if (i6 >= sparseArray.size()) {
                return;
            }
            t1 t1Var = ((y4) sparseArray.valueAt(i6)).U;
            if (t1Var != null) {
                t1Var.f9059b = false;
                t1Var.f9060c = 0;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        a5 a5Var = new a5();
        p0 p0Var = (p0) y0Var;
        long j6 = p0Var.f7907c;
        long j7 = 1024;
        if (j6 != -1 && j6 <= 1024) {
            j7 = j6;
        }
        ex0 ex0Var = a5Var.f2573a;
        p0Var.g(ex0Var.f4416a, 0, 4, false);
        long jD = ex0Var.D();
        a5Var.f2574b = 4;
        while (true) {
            if (jD != 440786851) {
                int i6 = (int) j7;
                int i7 = a5Var.f2574b + 1;
                a5Var.f2574b = i7;
                if (i7 == i6) {
                    break;
                }
                p0Var.g(ex0Var.f4416a, 0, 1, false);
                jD = ((jD << 8) & (-256)) | (ex0Var.f4416a[0] & 255);
            } else {
                long jA = a5Var.a(p0Var);
                long j8 = a5Var.f2574b;
                if (jA != Long.MIN_VALUE) {
                    long j9 = j8 + jA;
                    if (j6 == -1 || j9 < j6) {
                        while (true) {
                            long j10 = a5Var.f2574b;
                            if (j10 < j9) {
                                if (a5Var.a(p0Var) != Long.MIN_VALUE) {
                                    long jA2 = a5Var.a(p0Var);
                                    if (jA2 < 0) {
                                        break;
                                    }
                                    if (jA2 != 0) {
                                        int i8 = (int) jA2;
                                        p0Var.k(i8, false);
                                        a5Var.f2574b += i8;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j10 == j9) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[LOOP:1: B:6:0x001a->B:46:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x059d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x062a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.b5] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [int] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.b5] */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws rn {
        long j6;
        boolean z6;
        boolean z7;
        int i6;
        boolean z8;
        boolean z9;
        String str;
        boolean z10;
        ?? r5;
        boolean z11;
        int i7;
        int i8;
        long j7;
        int i9;
        int i10;
        int i11;
        long j8;
        int i12;
        int iB;
        ?? r32 = 0;
        this.G = false;
        while (!this.G) {
            x4 x4Var = this.f11151d0;
            ?? r52 = x4Var.f10351c;
            byte[] bArr = x4Var.f10349a;
            ArrayDeque arrayDeque = x4Var.f10350b;
            y5.k(x4Var.f10352d);
            while (true) {
                w4 w4Var = (w4) arrayDeque.peek();
                boolean z12 = true;
                z6 = true;
                z12 = true;
                if (w4Var != null) {
                    j6 = -1;
                    if (y0Var.zzf() >= w4Var.f10032b) {
                        ((z4) x4Var.f10352d.f6565t).a(((w4) arrayDeque.pop()).f10031a);
                        z7 = r32;
                    }
                } else {
                    j6 = -1;
                }
                int i13 = x4Var.f10353e;
                long j9 = j6;
                if (i13 == 0) {
                    long jD = r52.d(y0Var, true, r32, 4);
                    if (jD == -2) {
                        y0Var.zzj();
                        while (true) {
                            y0Var.h(r32 == true ? 1 : 0, 4, bArr);
                            byte b7 = bArr[r32 == true ? 1 : 0];
                            int i14 = r32 == true ? 1 : 0;
                            while (true) {
                                if (i14 < 8) {
                                    int i15 = i14 + 1;
                                    if ((b5.f2914d[i14] & b7) != 0) {
                                        i12 = i15;
                                    } else {
                                        i14 = i15;
                                    }
                                } else {
                                    i12 = -1;
                                }
                            }
                            if (i12 != -1 && i12 <= 4) {
                                iB = (int) b5.b(i12, r32, bArr);
                                Object obj = x4Var.f10352d.f6565t;
                                if (iB != 357149030 && iB != 524531317 && iB != 475249515) {
                                    if (iB == 374648427) {
                                        iB = 374648427;
                                    }
                                }
                            }
                            y0Var.b(1);
                        }
                        y0Var.b(i12);
                        j8 = iB;
                        z12 = true;
                    } else {
                        j8 = jD;
                    }
                    if (j8 == j9) {
                        z6 = r32 == true ? 1 : 0;
                        z7 = r32;
                    } else {
                        x4Var.f10354f = (int) j8;
                        x4Var.f10353e = z12 ? 1 : 0;
                    }
                } else {
                    if (i13 == 1) {
                    }
                    l2 l2Var = x4Var.f10352d;
                    i6 = x4Var.f10354f;
                    z4 z4Var = (z4) l2Var.f6565t;
                    RuntimeException runtimeException = null;
                    switch (i6) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            long j10 = x4Var.f10355g;
                            if (j10 > 8) {
                                throw rn.a(null, "Invalid integer size: " + j10);
                            }
                            long jA = x4Var.a(y0Var, (int) j10);
                            if (i6 != 20529) {
                                if (i6 != 20530) {
                                    switch (i6) {
                                        case 131:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10829d = (int) jA;
                                            break;
                                        case 136:
                                            boolean z13 = jA == 1;
                                            z4Var.i(i6);
                                            z4Var.f11167v.W = z13;
                                            break;
                                        case 155:
                                            z4Var.J = z4Var.g(jA);
                                            break;
                                        case 159:
                                            z4Var.i(i6);
                                            z4Var.f11167v.P = (int) jA;
                                            break;
                                        case 176:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10837m = (int) jA;
                                            break;
                                        case 179:
                                            z4Var.h(i6);
                                            z4Var.D.b(z4Var.g(jA));
                                            break;
                                        case 186:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10838n = (int) jA;
                                            break;
                                        case 215:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10828c = (int) jA;
                                            break;
                                        case 231:
                                            z4Var.C = z4Var.g(jA);
                                            break;
                                        case 238:
                                            z4Var.Q = (int) jA;
                                            break;
                                        case 241:
                                            if (!z4Var.F) {
                                                z4Var.h(i6);
                                                z4Var.E.b(jA);
                                                z4Var.F = true;
                                                break;
                                            }
                                            break;
                                        case 251:
                                            z4Var.R = true;
                                            break;
                                        case 16871:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10832g = (int) jA;
                                            break;
                                        case 16980:
                                            if (jA != 3) {
                                                throw rn.a(null, "ContentCompAlgo " + jA + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (jA < 1 || jA > 2) {
                                                throw rn.a(null, "DocTypeReadVersion " + jA + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (jA != 1) {
                                                throw rn.a(null, "EBMLReadVersion " + jA + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (jA != 5) {
                                                throw rn.a(null, "ContentEncAlgo " + jA + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (jA != 1) {
                                                throw rn.a(null, "AESSettingsCipherMode " + jA + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            z4Var.f11170y = jA + z4Var.f11164r;
                                            break;
                                        case 21432:
                                            int i16 = (int) jA;
                                            z4Var.i(i6);
                                            if (i16 != 0) {
                                                if (i16 != 1) {
                                                    if (i16 != 3) {
                                                        if (i16 == 15) {
                                                            z4Var.f11167v.f10847x = 3;
                                                            break;
                                                        }
                                                    } else {
                                                        z4Var.f11167v.f10847x = 1;
                                                        break;
                                                    }
                                                } else {
                                                    z4Var.f11167v.f10847x = 2;
                                                    break;
                                                }
                                            } else {
                                                z9 = false;
                                                z4Var.f11167v.f10847x = 0;
                                                z8 = z9;
                                                x4Var.f10353e = z8 ? 1 : 0;
                                                z10 = z8;
                                                break;
                                            }
                                            break;
                                        case 21680:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10840p = (int) jA;
                                            break;
                                        case 21682:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10842r = (int) jA;
                                            break;
                                        case 21690:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10841q = (int) jA;
                                            break;
                                        case 21930:
                                            boolean z14 = jA == 1;
                                            z4Var.i(i6);
                                            z4Var.f11167v.V = z14;
                                            break;
                                        case 21938:
                                            int i17 = (int) jA;
                                            z4Var.i(i6);
                                            y4 y4Var = z4Var.f11167v;
                                            y4Var.f10848y = true;
                                            y4Var.f10839o = i17;
                                            break;
                                        case 21998:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10831f = (int) jA;
                                            break;
                                        case 22186:
                                            z4Var.i(i6);
                                            z4Var.f11167v.S = jA;
                                            break;
                                        case 22203:
                                            z4Var.i(i6);
                                            z4Var.f11167v.T = jA;
                                            break;
                                        case 25188:
                                            z4Var.i(i6);
                                            z4Var.f11167v.Q = (int) jA;
                                            break;
                                        case 30114:
                                            z4Var.S = jA;
                                            break;
                                        case 30321:
                                            int i18 = (int) jA;
                                            z4Var.i(i6);
                                            if (i18 != 0) {
                                                if (i18 != 1) {
                                                    if (i18 != 2) {
                                                        if (i18 == 3) {
                                                            z4Var.f11167v.s = 3;
                                                            break;
                                                        }
                                                    } else {
                                                        z4Var.f11167v.s = 2;
                                                        break;
                                                    }
                                                } else {
                                                    z4Var.f11167v.s = 1;
                                                    break;
                                                }
                                            } else {
                                                z9 = false;
                                                z4Var.f11167v.s = 0;
                                                z8 = z9;
                                                x4Var.f10353e = z8 ? 1 : 0;
                                                z10 = z8;
                                                break;
                                            }
                                            break;
                                        case 2352003:
                                            z4Var.i(i6);
                                            z4Var.f11167v.f10830e = (int) jA;
                                            break;
                                        case 2807729:
                                            z4Var.s = jA;
                                            break;
                                        default:
                                            switch (i6) {
                                                case 21945:
                                                    int i19 = (int) jA;
                                                    z4Var.i(i6);
                                                    if (i19 != 1) {
                                                        if (i19 == 2) {
                                                            z4Var.f11167v.B = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        z4Var.f11167v.B = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 21946:
                                                    z4Var.i(i6);
                                                    int iB2 = mb2.b((int) jA);
                                                    if (iB2 != -1) {
                                                        z4Var.f11167v.A = iB2;
                                                        break;
                                                    }
                                                    break;
                                                case 21947:
                                                    z4Var.i(i6);
                                                    z4Var.f11167v.f10848y = true;
                                                    int iA = mb2.a((int) jA);
                                                    if (iA != -1) {
                                                        z4Var.f11167v.f10849z = iA;
                                                        break;
                                                    }
                                                    break;
                                                case 21948:
                                                    z4Var.i(i6);
                                                    z4Var.f11167v.C = (int) jA;
                                                    break;
                                                case 21949:
                                                    z4Var.i(i6);
                                                    z4Var.f11167v.D = (int) jA;
                                                    break;
                                            }
                                    }
                                } else if (jA != 1) {
                                    throw rn.a(null, "ContentEncodingScope " + jA + " not supported");
                                }
                            } else if (jA != 0) {
                                throw rn.a(null, "ContentEncodingOrder " + jA + " not supported");
                            }
                            z8 = false;
                            x4Var.f10353e = z8 ? 1 : 0;
                            z10 = z8;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            int i20 = r32 == true ? 1 : 0;
                            long j11 = x4Var.f10355g;
                            if (j11 > 2147483647L) {
                                throw rn.a(null, "String element size: " + j11);
                            }
                            int i21 = (int) j11;
                            if (i21 == 0) {
                                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            } else {
                                byte[] bArr2 = new byte[i21];
                                y0Var.i(i20, i21, bArr2);
                                while (i21 > 0) {
                                    int i22 = i21 - 1;
                                    if (bArr2[i22] == 0) {
                                        i21 = i22;
                                    } else {
                                        str = new String(bArr2, i20, i21);
                                    }
                                }
                                str = new String(bArr2, i20, i21);
                            }
                            if (i6 == 134) {
                                z4Var.i(i6);
                                z4Var.f11167v.f10827b = str;
                            } else if (i6 != 17026) {
                                if (i6 == 21358) {
                                    z4Var.i(i6);
                                    z4Var.f11167v.f10826a = str;
                                } else if (i6 == 2274716) {
                                    z4Var.i(i6);
                                    z4Var.f11167v.X = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw rn.a(null, "DocType " + str + " not supported");
                            }
                            z10 = false;
                            x4Var.f10353e = 0;
                            break;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long jZzf = y0Var.zzf();
                            arrayDeque.push(new w4(i6, x4Var.f10355g + jZzf));
                            l2 l2Var2 = x4Var.f10352d;
                            int i23 = x4Var.f10354f;
                            long j12 = x4Var.f10355g;
                            z4 z4Var2 = (z4) l2Var2.f6565t;
                            y5.k(z4Var2.f11149c0);
                            if (i23 == 160) {
                                r5 = 0;
                                z4Var2.R = false;
                                z4Var2.S = 0L;
                            } else if (i23 == 174) {
                                r5 = 0;
                                z4Var2.f11167v = new y4();
                            } else if (i23 != 187) {
                                if (i23 == 19899) {
                                    z4Var2.f11169x = -1;
                                    z4Var2.f11170y = j9;
                                } else if (i23 == 20533) {
                                    z4Var2.i(i23);
                                    z4Var2.f11167v.h = true;
                                } else if (i23 == 21968) {
                                    z4Var2.i(i23);
                                    z4Var2.f11167v.f10848y = true;
                                } else if (i23 == 408125543) {
                                    long j13 = z4Var2.f11164r;
                                    if (j13 != j9 && j13 != jZzf) {
                                        throw rn.a(null, "Multiple Segment elements not supported");
                                    }
                                    z4Var2.f11164r = jZzf;
                                    z4Var2.f11163q = j12;
                                } else if (i23 == 475249515) {
                                    z4Var2.D = new gt0(32);
                                    z4Var2.E = new gt0(32);
                                } else if (i23 == 524531317 && !z4Var2.f11168w) {
                                    if (!z4Var2.f11148c || z4Var2.A == j9) {
                                        z4Var2.f11149c0.f(new l1(z4Var2.f11166u, 0L));
                                        z4Var2.f11168w = true;
                                    } else {
                                        z4Var2.f11171z = true;
                                    }
                                }
                                r5 = 0;
                            } else {
                                r5 = 0;
                                z4Var2.F = false;
                            }
                            x4Var.f10353e = r5;
                            z10 = r5;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            int i24 = (int) x4Var.f10355g;
                            ?? r6 = z4Var.f11144a;
                            ex0 ex0Var = z4Var.f11161o;
                            SparseArray sparseArray = z4Var.f11146b;
                            ex0 ex0Var2 = z4Var.f11156j;
                            ex0 ex0Var3 = z4Var.h;
                            if (i6 == 161 || i6 == 163) {
                                if (z4Var.H == 0) {
                                    z4Var.N = (int) r6.d(y0Var, r32, true, 8);
                                    z4Var.O = r6.f2918b;
                                    z4Var.J = -9223372036854775807L;
                                    z4Var.H = 1;
                                    ex0Var3.g(r32 == true ? 1 : 0);
                                }
                                y4 y4Var2 = (y4) sparseArray.get(z4Var.N);
                                if (y4Var2 == null) {
                                    y0Var.b(i24 - z4Var.O);
                                    z4Var.H = r32 == true ? 1 : 0;
                                    z11 = r32;
                                } else {
                                    y4Var2.Y.getClass();
                                    if (z4Var.H == 1) {
                                        z4Var.k(y0Var, 3);
                                        int i25 = (ex0Var3.f4416a[2] & 6) >> 1;
                                        byte b8 = 255;
                                        if (i25 == 0) {
                                            z4Var.L = 1;
                                            int[] iArr = z4Var.M;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            z4Var.M = iArr;
                                            iArr[r32 == true ? 1 : 0] = (i24 - z4Var.O) - 3;
                                        } else {
                                            z4Var.k(y0Var, 4);
                                            int i26 = (ex0Var3.f4416a[3] & 255) + 1;
                                            z4Var.L = i26;
                                            int[] iArr2 = z4Var.M;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i26];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i26) {
                                                    iArr2 = new int[Math.max(length2 + length2, i26)];
                                                }
                                            }
                                            z4Var.M = iArr2;
                                            if (i25 == 2) {
                                                int i27 = (i24 - z4Var.O) - 4;
                                                int i28 = z4Var.L;
                                                Arrays.fill(iArr2, r32 == true ? 1 : 0, i28, i27 / i28);
                                            } else {
                                                if (i25 != 1) {
                                                    if (i25 != 3) {
                                                        throw rn.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    int i29 = r32 == true ? 1 : 0;
                                                    int i30 = i29;
                                                    int i31 = 4;
                                                    int i32 = r32;
                                                    while (true) {
                                                        int i33 = z4Var.L - 1;
                                                        if (i29 < i33) {
                                                            z4Var.M[i29] = i32;
                                                            int i34 = i31 + 1;
                                                            z4Var.k(y0Var, i34);
                                                            if (ex0Var3.f4416a[i31] == 0) {
                                                                throw rn.a(runtimeException, "No valid varint length mask found");
                                                            }
                                                            int i35 = i32;
                                                            while (true) {
                                                                if (i35 < 8) {
                                                                    int i36 = 1 << (7 - i35);
                                                                    if ((ex0Var3.f4416a[i31] & i36) != 0) {
                                                                        int i37 = i34 + i35;
                                                                        z4Var.k(y0Var, i37);
                                                                        i8 = i24;
                                                                        long j14 = (~i36) & ex0Var3.f4416a[i31] & b8;
                                                                        for (int i38 = i34; i38 < i37; i38++) {
                                                                            j14 = (j14 << 8) | (ex0Var3.f4416a[i38] & 255);
                                                                        }
                                                                        if (i29 > 0) {
                                                                            j7 = j14 - ((1 << ((i35 * 7) + 6)) + j9);
                                                                            i31 = i37;
                                                                        } else {
                                                                            i31 = i37;
                                                                            j7 = j14;
                                                                        }
                                                                    } else {
                                                                        i35++;
                                                                        b8 = 255;
                                                                    }
                                                                } else {
                                                                    i8 = i24;
                                                                    j7 = 0;
                                                                    i31 = i34;
                                                                }
                                                            }
                                                            if (j7 >= -2147483648L && j7 <= 2147483647L) {
                                                                int[] iArr3 = z4Var.M;
                                                                int i39 = (int) j7;
                                                                if (i29 != 0) {
                                                                    i39 += iArr3[i29 - 1];
                                                                }
                                                                iArr3[i29] = i39;
                                                                i30 += i39;
                                                                i29++;
                                                                i24 = i8;
                                                                i32 = i35;
                                                                runtimeException = null;
                                                                b8 = 255;
                                                            }
                                                        } else {
                                                            i7 = i32;
                                                            z4Var.M[i33] = ((i24 - z4Var.O) - i31) - i30;
                                                        }
                                                    }
                                                    throw rn.a(null, "EBML lacing sample size out of range.");
                                                }
                                                int i40 = r32 == true ? 1 : 0;
                                                int i41 = i40;
                                                int i42 = 4;
                                                while (true) {
                                                    int i43 = z4Var.L - 1;
                                                    if (i40 < i43) {
                                                        z4Var.M[i40] = r32 == true ? 1 : 0;
                                                        while (true) {
                                                            i9 = i42 + 1;
                                                            z4Var.k(y0Var, i9);
                                                            int i44 = ex0Var3.f4416a[i42] & 255;
                                                            int[] iArr4 = z4Var.M;
                                                            i10 = iArr4[i40] + i44;
                                                            iArr4[i40] = i10;
                                                            if (i44 != 255) {
                                                                break;
                                                            }
                                                            i42 = i9;
                                                        }
                                                        i41 += i10;
                                                        i40++;
                                                        i42 = i9;
                                                    } else {
                                                        z4Var.M[i43] = ((i24 - z4Var.O) - i42) - i41;
                                                    }
                                                }
                                            }
                                        }
                                        i7 = r32 == true ? 1 : 0;
                                        int i45 = ex0Var3.f4416a[i7] << 8;
                                        z4Var.I = z4Var.g((r3[1] & 255) | i45) + z4Var.C;
                                        if (y4Var2.f10829d == 2) {
                                            i11 = 1;
                                        } else if (i6 == 163) {
                                            i11 = (ex0Var3.f4416a[2] & 128) == 128 ? 1 : i7;
                                            i6 = 163;
                                        } else {
                                            i11 = i7;
                                        }
                                        z4Var.P = i11;
                                        z4Var.H = 2;
                                        z4Var.K = i7;
                                    }
                                    if (i6 == 163) {
                                        while (true) {
                                            int i46 = z4Var.K;
                                            if (i46 < z4Var.L) {
                                                z4Var.j(y4Var2, z4Var.I + ((z4Var.K * y4Var2.f10830e) / CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL), z4Var.P, z4Var.b(y0Var, y4Var2, z4Var.M[i46], false), 0);
                                                z4Var.K++;
                                            } else {
                                                z11 = false;
                                                z4Var.H = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i47 = z4Var.K;
                                            if (i47 < z4Var.L) {
                                                int[] iArr5 = z4Var.M;
                                                iArr5[i47] = z4Var.b(y0Var, y4Var2, iArr5[i47], true);
                                                z4Var.K++;
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                    }
                                }
                                x4Var.f10353e = z11 ? 1 : 0;
                                z10 = z11;
                                break;
                            } else {
                                if (i6 != 165) {
                                    if (i6 == 16877) {
                                        z4Var.i(i6);
                                        y4 y4Var3 = z4Var.f11167v;
                                        int i48 = y4Var3.f10832g;
                                        if (i48 == 1685485123 || i48 == 1685480259) {
                                            byte[] bArr3 = new byte[i24];
                                            y4Var3.O = bArr3;
                                            y0Var.i(r32 == true ? 1 : 0, i24, bArr3);
                                            z11 = r32;
                                        } else {
                                            y0Var.b(i24);
                                            z11 = r32;
                                        }
                                    } else if (i6 == 16981) {
                                        z4Var.i(i6);
                                        byte[] bArr4 = new byte[i24];
                                        z4Var.f11167v.f10833i = bArr4;
                                        y0Var.i(r32 == true ? 1 : 0, i24, bArr4);
                                        z11 = r32;
                                    } else if (i6 == 18402) {
                                        byte[] bArr5 = new byte[i24];
                                        y0Var.i(r32 == true ? 1 : 0, i24, bArr5);
                                        z4Var.i(i6);
                                        z4Var.f11167v.f10834j = new r1(1, bArr5, r32 == true ? 1 : 0, r32 == true ? 1 : 0);
                                        z11 = r32;
                                    } else if (i6 == 21419) {
                                        Arrays.fill(ex0Var2.f4416a, r32 == true ? (byte) 1 : (byte) 0);
                                        y0Var.i(4 - i24, i24, ex0Var2.f4416a);
                                        ex0Var2.j(r32 == true ? 1 : 0);
                                        z4Var.f11169x = (int) ex0Var2.D();
                                        z11 = r32;
                                    } else if (i6 == 25506) {
                                        z4Var.i(i6);
                                        byte[] bArr6 = new byte[i24];
                                        z4Var.f11167v.f10835k = bArr6;
                                        y0Var.i(r32 == true ? 1 : 0, i24, bArr6);
                                        z11 = r32;
                                    } else {
                                        if (i6 != 30322) {
                                            throw rn.a(null, "Unexpected id: " + i6);
                                        }
                                        z4Var.i(i6);
                                        byte[] bArr7 = new byte[i24];
                                        z4Var.f11167v.f10846w = bArr7;
                                        y0Var.i(r32 == true ? 1 : 0, i24, bArr7);
                                        z11 = r32;
                                    }
                                } else if (z4Var.H != 2) {
                                    z11 = false;
                                } else {
                                    y4 y4Var4 = (y4) sparseArray.get(z4Var.N);
                                    if (z4Var.Q == 4 && "V_VP9".equals(y4Var4.f10827b)) {
                                        ex0Var.g(i24);
                                        y0Var.i(r32 == true ? 1 : 0, i24, ex0Var.f4416a);
                                        z11 = r32;
                                    } else {
                                        y0Var.b(i24);
                                        z11 = r32;
                                    }
                                }
                                x4Var.f10353e = z11 ? 1 : 0;
                                z10 = z11;
                            }
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            long j15 = x4Var.f10355g;
                            if (j15 != 4 && j15 != 8) {
                                throw rn.a(null, "Invalid float size: " + j15);
                            }
                            int i49 = (int) j15;
                            double dIntBitsToFloat = i49 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(x4Var.a(y0Var, i49));
                            if (i6 == 181) {
                                z4Var.i(i6);
                                z4Var.f11167v.R = (int) dIntBitsToFloat;
                            } else if (i6 != 17545) {
                                switch (i6) {
                                    case 21969:
                                        z4Var.i(i6);
                                        z4Var.f11167v.E = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        z4Var.i(i6);
                                        z4Var.f11167v.F = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        z4Var.i(i6);
                                        z4Var.f11167v.G = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        z4Var.i(i6);
                                        z4Var.f11167v.H = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        z4Var.i(i6);
                                        z4Var.f11167v.I = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        z4Var.i(i6);
                                        z4Var.f11167v.J = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        z4Var.i(i6);
                                        z4Var.f11167v.K = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        z4Var.i(i6);
                                        z4Var.f11167v.L = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        z4Var.i(i6);
                                        z4Var.f11167v.M = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        z4Var.i(i6);
                                        z4Var.f11167v.N = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i6) {
                                            case 30323:
                                                z4Var.i(i6);
                                                z4Var.f11167v.f10843t = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                z4Var.i(i6);
                                                z4Var.f11167v.f10844u = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                z4Var.i(i6);
                                                z4Var.f11167v.f10845v = (float) dIntBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                z4Var.f11165t = (long) dIntBitsToFloat;
                            }
                            x4Var.f10353e = r32 == true ? 1 : 0;
                            z10 = r32;
                            break;
                        default:
                            y0Var.b((int) x4Var.f10355g);
                            x4Var.f10353e = r32 == true ? 1 : 0;
                    }
                }
                x4Var.f10355g = r52.d(y0Var, r32, z12, 8);
                x4Var.f10353e = 2;
                l2 l2Var3 = x4Var.f10352d;
                i6 = x4Var.f10354f;
                z4 z4Var3 = (z4) l2Var3.f6565t;
                RuntimeException runtimeException2 = null;
                switch (i6) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        break;
                }
            }
            z6 = true;
            z7 = z10;
            if (z6) {
                long jZzf2 = y0Var.zzf();
                if (this.f11171z) {
                    this.B = jZzf2;
                    b1Var.f2886a = this.A;
                    this.f11171z = z7;
                    return 1;
                }
                if (this.f11168w) {
                    long j16 = this.B;
                    if (j16 != -1) {
                        b1Var.f2886a = j16;
                        this.B = -1L;
                        return 1;
                    }
                }
                r32 = 0;
            } else {
                int i50 = 0;
                while (true) {
                    SparseArray sparseArray2 = this.f11146b;
                    if (i50 >= sparseArray2.size()) {
                        return -1;
                    }
                    y4 y4Var5 = (y4) sparseArray2.valueAt(i50);
                    y4Var5.Y.getClass();
                    t1 t1Var = y4Var5.U;
                    if (t1Var != null) {
                        t1Var.a(y4Var5.Y, y4Var5.f10834j);
                    }
                    i50++;
                }
            }
        }
        return r32 == true ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        if (this.f11150d) {
            z0Var = new b7(z0Var, this.f11152e);
        }
        this.f11149c0 = z0Var;
    }

    public final long g(long j6) throws rn {
        long j7 = this.s;
        if (j7 != -9223372036854775807L) {
            return j31.u(j6, j7, 1000L, RoundingMode.DOWN);
        }
        throw rn.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final void h(int i6) throws rn {
        if (this.D == null || this.E == null) {
            throw rn.a(null, "Element " + i6 + " must be in a Cues");
        }
    }

    public final void i(int i6) throws rn {
        if (this.f11167v != null) {
            return;
        }
        throw rn.a(null, "Element " + i6 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba A[EDGE_INSN: B:52:0x00ba->B:40:0x00ba BREAK  A[LOOP:0: B:34:0x00a9->B:39:0x00b7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(y4 y4Var, long j6, int i6, int i7, int i8) {
        byte[] bArrN;
        int i9;
        int i10;
        int i11;
        t1 t1Var = y4Var.U;
        if (t1Var != null) {
            t1Var.b(y4Var.Y, j6, i6, i7, i8, y4Var.f10834j);
        } else if ("S_TEXT/UTF8".equals(y4Var.f10827b) || "S_TEXT/ASS".equals(y4Var.f10827b) || "S_TEXT/WEBVTT".equals(y4Var.f10827b)) {
            if (this.L > 1) {
                qs0.f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
            } else {
                long j7 = this.J;
                if (j7 == -9223372036854775807L) {
                    qs0.f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                } else {
                    String str = y4Var.f10827b;
                    ex0 ex0Var = this.f11158l;
                    byte[] bArr = ex0Var.f4416a;
                    int iHashCode = str.hashCode();
                    if (iHashCode == 738597099) {
                        if (str.equals("S_TEXT/ASS")) {
                            bArrN = n("%01d:%02d:%02d:%02d", j7, 10000L);
                            i9 = 21;
                            System.arraycopy(bArrN, 0, bArr, i9, bArrN.length);
                            i10 = ex0Var.f4417b;
                            while (true) {
                                if (i10 >= ex0Var.f4418c) {
                                }
                                i10++;
                            }
                            y4Var.Y.e(ex0Var.f4418c, ex0Var);
                            i11 = i7 + ex0Var.f4418c;
                        }
                        throw new IllegalArgumentException();
                    }
                    if (iHashCode == 1045209816) {
                        if (str.equals("S_TEXT/WEBVTT")) {
                            bArrN = n("%02d:%02d:%02d.%03d", j7, 1000L);
                            i9 = 25;
                            System.arraycopy(bArrN, 0, bArr, i9, bArrN.length);
                            i10 = ex0Var.f4417b;
                            while (true) {
                                if (i10 >= ex0Var.f4418c) {
                                }
                                i10++;
                            }
                            y4Var.Y.e(ex0Var.f4418c, ex0Var);
                            i11 = i7 + ex0Var.f4418c;
                        }
                        throw new IllegalArgumentException();
                    }
                    if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                        bArrN = n("%02d:%02d:%02d,%03d", j7, 1000L);
                        i9 = 19;
                        System.arraycopy(bArrN, 0, bArr, i9, bArrN.length);
                        i10 = ex0Var.f4417b;
                        while (true) {
                            if (i10 >= ex0Var.f4418c) {
                                break;
                            }
                            if (ex0Var.f4416a[i10] == 0) {
                                ex0Var.i(i10);
                                break;
                            }
                            i10++;
                        }
                        y4Var.Y.e(ex0Var.f4418c, ex0Var);
                        i11 = i7 + ex0Var.f4418c;
                    }
                    throw new IllegalArgumentException();
                    if ((i6 & 268435456) != 0) {
                        int i12 = this.L;
                        ex0 ex0Var2 = this.f11161o;
                        if (i12 > 1) {
                            ex0Var2.g(0);
                        } else {
                            int i13 = ex0Var2.f4418c;
                            y4Var.Y.f(ex0Var2, i13, 2);
                            i11 += i13;
                        }
                    }
                    y4Var.Y.a(j6, i6, i11, i8, y4Var.f10834j);
                }
            }
            i11 = i7;
            if ((i6 & 268435456) != 0) {
            }
            y4Var.Y.a(j6, i6, i11, i8, y4Var.f10834j);
        } else {
            i11 = i7;
            if ((i6 & 268435456) != 0) {
            }
            y4Var.Y.a(j6, i6, i11, i8, y4Var.f10834j);
        }
        this.G = true;
    }

    public final void k(y0 y0Var, int i6) {
        ex0 ex0Var = this.h;
        if (ex0Var.f4418c >= i6) {
            return;
        }
        byte[] bArr = ex0Var.f4416a;
        if (bArr.length < i6) {
            int length = bArr.length;
            ex0Var.e(Math.max(length + length, i6));
        }
        byte[] bArr2 = ex0Var.f4416a;
        int i7 = ex0Var.f4418c;
        y0Var.i(i7, i6 - i7, bArr2);
        ex0Var.i(i6);
    }

    public final void l() {
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = 0;
        this.f11145a0 = (byte) 0;
        this.f11147b0 = false;
        this.f11157k.g(0);
    }

    public final void m(y0 y0Var, byte[] bArr, int i6) {
        int length = bArr.length;
        int i7 = length + i6;
        ex0 ex0Var = this.f11158l;
        byte[] bArr2 = ex0Var.f4416a;
        if (bArr2.length < i7) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i7 + i6);
            ex0Var.h(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        y0Var.i(length, i6, ex0Var.f4416a);
        ex0Var.j(0);
        ex0Var.i(i7);
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }

    public z4(x4 x4Var, int i6, z6 z6Var) {
        this.f11164r = -1L;
        this.s = -9223372036854775807L;
        this.f11165t = -9223372036854775807L;
        this.f11166u = -9223372036854775807L;
        this.A = -1L;
        this.B = -1L;
        this.C = -9223372036854775807L;
        this.f11151d0 = x4Var;
        x4Var.f10352d = new l2(1, this);
        this.f11152e = z6Var;
        this.f11148c = true;
        this.f11150d = (i6 & 2) == 0;
        this.f11144a = new b5();
        this.f11146b = new SparseArray();
        this.h = new ex0(4);
        this.f11155i = new ex0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11156j = new ex0(4);
        this.f11153f = new ex0(uf1.f9551a);
        this.f11154g = new ex0(4);
        this.f11157k = new ex0();
        this.f11158l = new ex0();
        this.f11159m = new ex0(8);
        this.f11160n = new ex0();
        this.f11161o = new ex0();
        this.M = new int[1];
    }
}
