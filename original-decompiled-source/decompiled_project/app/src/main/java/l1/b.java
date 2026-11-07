package l1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import eh.p;
import i0.u2;
import i2.g1;
import j2.v4;
import j2.w4;
import j2.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import m2.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p.l0;
import p.y;
import pg.f0;
import pg.q;
import q2.c0;
import q2.t;
import q2.w;
import qg.x;
import rh.c;
import t2.g0;
import t2.h0;

/* loaded from: classes.dex */
public final class b implements androidx.lifecycle.e, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f16648a;

    /* renamed from: b, reason: collision with root package name */
    public final AndroidComposeView.e f16649b;

    /* renamed from: c, reason: collision with root package name */
    public m2.b f16650c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16651d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final long f16652e = 100;

    /* renamed from: f, reason: collision with root package name */
    public a f16653f = a.f16663a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16654g = true;

    /* renamed from: h, reason: collision with root package name */
    public final rh.c f16655h = rh.k.a(1, 6, null);

    /* renamed from: j, reason: collision with root package name */
    public final Handler f16656j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public y f16657k;

    /* renamed from: l, reason: collision with root package name */
    public long f16658l;

    /* renamed from: m, reason: collision with root package name */
    public final y<v4> f16659m;

    /* renamed from: n, reason: collision with root package name */
    public v4 f16660n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16661p;

    /* renamed from: q, reason: collision with root package name */
    public final l1.a f16662q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16663a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f16664b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f16665c;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            f16663a = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            f16664b = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f16665c = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f16665c.clone();
        }
    }

    /* renamed from: l1.b$b, reason: collision with other inner class name */
    public static final class C0166b {
        public static void a(b bVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            w4 w4VarB;
            t tVar;
            q2.a aVar;
            eh.l lVar;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = longSparseArray.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseA = h.a(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (w4VarB = bVar.c().b((int) jKeyAt)) != null && (tVar = w4VarB.f14962a) != null && (aVar = (q2.a) q2.m.a(tVar.f21811d, q2.k.f21783k)) != null && (lVar = (eh.l) aVar.f21753b) != null) {
                }
            }
        }
    }

    public static final class c extends s implements p<Integer, t, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4 f16666a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f16667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v4 v4Var, b bVar) {
            super(2);
            this.f16666a = v4Var;
            this.f16667b = bVar;
        }

        @Override // eh.p
        public final f0 invoke(Integer num, t tVar) {
            int iIntValue = num.intValue();
            t tVar2 = tVar;
            if (!this.f16666a.f14933b.b(tVar2.f21814g)) {
                b bVar = this.f16667b;
                bVar.i(iIntValue, tVar2);
                bVar.f16655h.g(f0.f21461a);
            }
            return f0.f21461a;
        }
    }

    public static final class d extends s implements p<Integer, t, f0> {
        public d() {
            super(2);
        }

        @Override // eh.p
        public final f0 invoke(Integer num, t tVar) {
            b.this.i(num.intValue(), tVar);
            return f0.f21461a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l1.a] */
    public b(AndroidComposeView androidComposeView, AndroidComposeView.e eVar) {
        this.f16648a = androidComposeView;
        this.f16649b = eVar;
        y yVar = p.j.f20648a;
        r.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16657k = yVar;
        this.f16659m = new y<>();
        t tVarA = androidComposeView.getSemanticsOwner().a();
        r.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f16660n = new v4(tVarA, yVar);
        this.f16662q = new Runnable() { // from class: l1.a
            /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                char c10;
                long j10;
                long j11;
                long j12;
                y<v4> yVar2;
                AndroidComposeView androidComposeView2;
                y<v4> yVar3;
                y<v4> yVar4;
                p.i<w4> iVar;
                int[] iArr;
                p.i<w4> iVar2;
                y<v4> yVar5;
                AndroidComposeView androidComposeView3;
                int[] iArr2;
                long j13;
                long[] jArr;
                long[] jArr2;
                int i10;
                long j14;
                char c11;
                int i11;
                int i12;
                b bVar = this.f16647a;
                boolean zD = bVar.d();
                y<v4> yVar6 = bVar.f16659m;
                AndroidComposeView androidComposeView4 = bVar.f16648a;
                if (zD) {
                    androidComposeView4.a(true);
                    int[] iArr3 = yVar6.f20644b;
                    long[] jArr3 = yVar6.f20643a;
                    int length = jArr3.length - 2;
                    char c12 = 7;
                    int i13 = 8;
                    if (length >= 0) {
                        int i14 = 0;
                        j10 = 128;
                        j11 = 255;
                        while (true) {
                            long j15 = jArr3[i14];
                            j12 = -9187201950435737472L;
                            if ((((~j15) << c12) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j15 & 255) < 128) {
                                        int i17 = iArr3[(i14 << 3) + i16];
                                        c11 = c12;
                                        if (!bVar.c().a(i17)) {
                                            i11 = i13;
                                            i12 = i16;
                                            bVar.f16651d.add(new m(i17, bVar.f16658l, n.f16681b, null));
                                            bVar.f16655h.g(f0.f21461a);
                                        }
                                        j15 >>= i11;
                                        i16 = i12 + 1;
                                        c12 = c11;
                                        i13 = i11;
                                    } else {
                                        c11 = c12;
                                    }
                                    i11 = i13;
                                    i12 = i16;
                                    j15 >>= i11;
                                    i16 = i12 + 1;
                                    c12 = c11;
                                    i13 = i11;
                                }
                                c10 = c12;
                                if (i15 != i13) {
                                    break;
                                }
                            } else {
                                c10 = c12;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                            c12 = c10;
                            i13 = 8;
                        }
                    } else {
                        c10 = 7;
                        j10 = 128;
                        j11 = 255;
                        j12 = -9187201950435737472L;
                    }
                    bVar.f(androidComposeView4.getSemanticsOwner().a(), bVar.f16660n);
                    p.i<w4> iVarC = bVar.c();
                    int[] iArr4 = iVarC.f20644b;
                    long[] jArr4 = iVarC.f20643a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j16 = jArr4[i18];
                            if ((((~j16) << c10) & j16 & j12) != j12) {
                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                int i20 = 0;
                                while (i20 < i19) {
                                    if ((j16 & j11) < j10) {
                                        int i21 = iArr4[(i18 << 3) + i20];
                                        v4 v4VarB = yVar6.b(i21);
                                        w4 w4VarB = iVarC.b(i21);
                                        t tVar = w4VarB != null ? w4VarB.f14962a : null;
                                        if (tVar == null) {
                                            throw k1.a.a("no value for specified key");
                                        }
                                        int i22 = tVar.f21814g;
                                        q2.l lVar = tVar.f21811d;
                                        l0<c0<?>, Object> l0Var = lVar.f21799a;
                                        if (v4VarB == null) {
                                            Object[] objArr = l0Var.f20738b;
                                            long[] jArr5 = l0Var.f20737a;
                                            iVar2 = iVarC;
                                            int length3 = jArr5.length - 2;
                                            if (length3 >= 0) {
                                                androidComposeView3 = androidComposeView4;
                                                iArr2 = iArr4;
                                                int i23 = 0;
                                                while (true) {
                                                    long j17 = jArr5[i23];
                                                    j13 = j16;
                                                    if ((((~j17) << c10) & j17 & j12) != j12) {
                                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j17 & j11) < j10) {
                                                                j14 = j17;
                                                                c0 c0Var = (c0) objArr[(i23 << 3) + i25];
                                                                c0<List<t2.b>> c0Var2 = w.f21845z;
                                                                if (r.a(c0Var, c0Var2)) {
                                                                    List list = (List) q2.m.a(lVar, c0Var2);
                                                                    bVar.g(i22, String.valueOf(list != null ? (t2.b) x.D(list) : null));
                                                                }
                                                            } else {
                                                                j14 = j17;
                                                            }
                                                            i25++;
                                                            j17 = j14 >> 8;
                                                        }
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                        if (i23 == length3) {
                                                            break;
                                                        }
                                                        i23++;
                                                        j16 = j13;
                                                    }
                                                }
                                            } else {
                                                androidComposeView3 = androidComposeView4;
                                                iArr2 = iArr4;
                                                j13 = j16;
                                            }
                                        } else {
                                            iVar2 = iVarC;
                                            androidComposeView3 = androidComposeView4;
                                            iArr2 = iArr4;
                                            j13 = j16;
                                            Object[] objArr2 = l0Var.f20738b;
                                            long[] jArr6 = l0Var.f20737a;
                                            int length4 = jArr6.length - 2;
                                            if (length4 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    long j18 = jArr6[i26];
                                                    Object[] objArr3 = objArr2;
                                                    yVar5 = yVar6;
                                                    if ((((~j18) << c10) & j18 & j12) != j12) {
                                                        int i27 = 8 - ((~(i26 - length4)) >>> 31);
                                                        int i28 = 0;
                                                        while (i28 < i27) {
                                                            if ((j18 & j11) < j10) {
                                                                jArr2 = jArr6;
                                                                c0 c0Var3 = (c0) objArr3[(i26 << 3) + i28];
                                                                i10 = i28;
                                                                c0<List<t2.b>> c0Var4 = w.f21845z;
                                                                if (r.a(c0Var3, c0Var4)) {
                                                                    List list2 = (List) q2.m.a(v4VarB.f14932a, c0Var4);
                                                                    t2.b bVar2 = list2 != null ? (t2.b) x.D(list2) : null;
                                                                    List list3 = (List) q2.m.a(lVar, c0Var4);
                                                                    t2.b bVar3 = list3 != null ? (t2.b) x.D(list3) : null;
                                                                    if (!r.a(bVar2, bVar3)) {
                                                                        bVar.g(i22, String.valueOf(bVar3));
                                                                    }
                                                                }
                                                            } else {
                                                                jArr2 = jArr6;
                                                                i10 = i28;
                                                            }
                                                            j18 >>= 8;
                                                            i28 = i10 + 1;
                                                            jArr6 = jArr2;
                                                        }
                                                        jArr = jArr6;
                                                        if (i27 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr = jArr6;
                                                    }
                                                    if (i26 == length4) {
                                                        break;
                                                    }
                                                    i26++;
                                                    yVar6 = yVar5;
                                                    objArr2 = objArr3;
                                                    jArr6 = jArr;
                                                }
                                            }
                                        }
                                        yVar5 = yVar6;
                                    } else {
                                        iVar2 = iVarC;
                                        yVar5 = yVar6;
                                        androidComposeView3 = androidComposeView4;
                                        iArr2 = iArr4;
                                        j13 = j16;
                                    }
                                    j16 = j13 >> 8;
                                    i20++;
                                    iVarC = iVar2;
                                    yVar6 = yVar5;
                                    androidComposeView4 = androidComposeView3;
                                    iArr4 = iArr2;
                                }
                                iVar = iVarC;
                                yVar2 = yVar6;
                                androidComposeView2 = androidComposeView4;
                                iArr = iArr4;
                                if (i19 != 8) {
                                    break;
                                }
                            } else {
                                iVar = iVarC;
                                yVar2 = yVar6;
                                androidComposeView2 = androidComposeView4;
                                iArr = iArr4;
                            }
                            if (i18 == length2) {
                                break;
                            }
                            i18++;
                            iVarC = iVar;
                            yVar6 = yVar2;
                            androidComposeView4 = androidComposeView2;
                            iArr4 = iArr;
                        }
                    } else {
                        yVar2 = yVar6;
                        androidComposeView2 = androidComposeView4;
                    }
                    yVar2.c();
                    p.i<w4> iVarC2 = bVar.c();
                    int[] iArr5 = iVarC2.f20644b;
                    Object[] objArr4 = iVarC2.f20645c;
                    long[] jArr7 = iVarC2.f20643a;
                    int length5 = jArr7.length - 2;
                    if (length5 >= 0) {
                        int i29 = 0;
                        while (true) {
                            long j19 = jArr7[i29];
                            if ((((~j19) << c10) & j19 & j12) != j12) {
                                int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                int i31 = 0;
                                while (i31 < i30) {
                                    if ((j19 & j11) < j10) {
                                        int i32 = (i29 << 3) + i31;
                                        int i33 = iArr5[i32];
                                        v4 v4Var = new v4(((w4) objArr4[i32]).f14962a, bVar.c());
                                        yVar4 = yVar2;
                                        yVar4.h(i33, v4Var);
                                    } else {
                                        yVar4 = yVar2;
                                    }
                                    j19 >>= 8;
                                    i31++;
                                    yVar2 = yVar4;
                                }
                                yVar3 = yVar2;
                                if (i30 != 8) {
                                    break;
                                }
                            } else {
                                yVar3 = yVar2;
                            }
                            if (i29 == length5) {
                                break;
                            }
                            i29++;
                            yVar2 = yVar3;
                        }
                    }
                    bVar.f16660n = new v4(androidComposeView2.getSemanticsOwner().a(), bVar.c());
                    bVar.f16661p = false;
                }
            }
        };
    }

    @Override // androidx.lifecycle.e
    public final void N(androidx.lifecycle.t tVar) {
        this.f16650c = (m2.b) this.f16649b.invoke();
        i(-1, this.f16648a.getSemanticsOwner().a());
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (ph.t0.b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vg.c cVar) {
        l lVar;
        rh.j aVar;
        b bVar;
        b bVar2;
        Object objA;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f16675e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f16675e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(this, cVar);
            }
        }
        Object obj = lVar.f16673c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = lVar.f16675e;
        if (i11 == 0) {
            q.b(obj);
            rh.c cVar2 = this.f16655h;
            cVar2.getClass();
            aVar = new c.a();
            bVar = this;
            lVar.f16671a = bVar;
            lVar.f16672b = aVar;
            lVar.f16675e = 1;
            objA = aVar.a(lVar);
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = lVar.f16672b;
            bVar2 = lVar.f16671a;
            q.b(obj);
            bVar = bVar2;
            lVar.f16671a = bVar;
            lVar.f16672b = aVar;
            lVar.f16675e = 1;
            objA = aVar.a(lVar);
            if (objA != aVar2) {
                bVar2 = bVar;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    return f0.f21461a;
                }
                aVar.next();
                if (bVar2.d()) {
                    bVar2.e();
                }
                if (!bVar2.f16661p) {
                    bVar2.f16661p = true;
                    bVar2.f16656j.post(bVar2.f16662q);
                }
                long j10 = bVar2.f16652e;
                lVar.f16671a = bVar2;
                lVar.f16672b = aVar;
                lVar.f16675e = 2;
            }
            return aVar2;
        }
        aVar = lVar.f16672b;
        bVar2 = lVar.f16671a;
        q.b(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b(t tVar, p<? super Integer, ? super t, f0> pVar) {
        tVar.getClass();
        List listH = t.h(4, tVar);
        int size = listH.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listH.get(i11);
            if (c().a(((t) obj).f21814g)) {
                pVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final p.i<w4> c() {
        if (this.f16654g) {
            this.f16654g = false;
            this.f16657k = x4.a(this.f16648a.getSemanticsOwner());
            this.f16658l = System.currentTimeMillis();
        }
        return this.f16657k;
    }

    public final boolean d() {
        return this.f16650c != null;
    }

    public final void e() {
        AutofillId autofillIdA;
        m2.b bVar = this.f16650c;
        if (bVar == null) {
            return;
        }
        Object obj = bVar.f17630a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f16651d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            int iOrdinal = mVar.f16678c.ordinal();
            if (iOrdinal == 0) {
                m2.e eVar = mVar.f16679d;
                if (eVar != null) {
                    ViewStructure viewStructure = eVar.f17632a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        b.a.c(m2.a.a(obj), viewStructure);
                    }
                }
            } else if (iOrdinal == 1 && (autofillIdA = bVar.a(mVar.f16676a)) != null && Build.VERSION.SDK_INT >= 29) {
                b.a.d(m2.a.a(obj), autofillIdA);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b.a.f(m2.a.a(obj), bVar.f17631b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void f(t tVar, v4 v4Var) {
        b(tVar, new c(v4Var, this));
        List listH = t.h(4, tVar);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar2 = (t) listH.get(i10);
            p.i<w4> iVarC = c();
            int i11 = tVar2.f21814g;
            if (iVarC.a(i11)) {
                y<v4> yVar = this.f16659m;
                if (yVar.a(i11)) {
                    v4 v4VarB = yVar.b(i11);
                    if (v4VarB == null) {
                        throw k1.a.a("node not present in pruned tree before this change");
                    }
                    f(tVar2, v4VarB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i10, String str) {
        m2.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (bVar = this.f16650c) != null) {
            AutofillId autofillIdA = bVar.a(i10);
            if (autofillIdA == null) {
                throw k1.a.a("Invalid content capture ID");
            }
            if (i11 >= 29) {
                b.a.e(m2.a.a(bVar.f17630a), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10, t tVar) {
        q2.a aVar;
        eh.l lVar;
        int i11;
        m2.e eVar;
        g1 g1VarC;
        String strG;
        eh.l lVar2;
        if (d()) {
            q2.l lVar3 = tVar.f21811d;
            Boolean bool = (Boolean) q2.m.a(lVar3, w.B);
            if (this.f16653f == a.f16663a && r.a(bool, Boolean.TRUE)) {
                q2.a aVar2 = (q2.a) q2.m.a(lVar3, q2.k.f21784l);
                if (aVar2 != null && (lVar2 = (eh.l) aVar2.f21753b) != null) {
                }
            } else if (this.f16653f == a.f16664b && r.a(bool, Boolean.FALSE) && (aVar = (q2.a) q2.m.a(lVar3, q2.k.f21784l)) != null && (lVar = (eh.l) aVar.f21753b) != null) {
            }
            int i12 = tVar.f21814g;
            m2.b bVar = this.f16650c;
            if (bVar != null && (i11 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f16648a.getAutofillId();
                t tVarJ = tVar.j();
                int i13 = tVar.f21814g;
                if (tVarJ == null || (autofillId = bVar.a(tVarJ.f21814g)) != null) {
                    m2.e eVar2 = i11 >= 29 ? new m2.e(b.a.b(m2.a.a(bVar.f17630a), autofillId, i13)) : null;
                    if (eVar2 == null) {
                        eVar = null;
                    } else {
                        ViewStructure viewStructure = eVar2.f17632a;
                        q2.l lVar4 = tVar.f21811d;
                        if (!lVar4.f21799a.b(w.I)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.f16658l);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
                            }
                            String str = (String) q2.m.a(lVar4, w.f21843x);
                            if (str != null) {
                                viewStructure.setId(i13, null, null, str);
                            }
                            if (((Boolean) q2.m.a(lVar4, w.f21832m)) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            List list = (List) q2.m.a(lVar4, w.f21845z);
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(h3.a.a(list, "\n", null, 62));
                            }
                            t2.b bVar2 = (t2.b) q2.m.a(lVar4, w.D);
                            if (bVar2 != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(bVar2);
                            }
                            List list2 = (List) q2.m.a(lVar4, w.f21820a);
                            if (list2 != null) {
                                viewStructure.setContentDescription(h3.a.a(list2, "\n", null, 62));
                            }
                            q2.i iVar = (q2.i) q2.m.a(lVar4, w.f21842w);
                            if (iVar != null && (strG = x4.g(iVar.f21770a)) != null) {
                                viewStructure.setClassName(strG);
                            }
                            h0 h0VarC = x4.c(lVar4);
                            if (h0VarC != null) {
                                g0 g0Var = h0VarC.f27819a;
                                t2.l0 l0Var = g0Var.f27810b;
                                f3.d dVar = g0Var.f27815g;
                                viewStructure.setTextStyle(dVar.G0() * dVar.getDensity() * f3.t.c(l0Var.f27852a.f27776b), 0, 0, 0);
                            }
                            t tVarJ2 = tVar.j();
                            p1.e eVarN = p1.e.f21130e;
                            if (tVarJ2 != null && (g1VarC = tVar.c()) != null) {
                                g1 g1Var = g1VarC.l1().f1157p ? g1VarC : null;
                                if (g1Var != null) {
                                    eVarN = i2.k.d(tVarJ2.f21808a, 8).N(g1Var, true);
                                }
                            }
                            float f10 = eVarN.f21131a;
                            float f11 = eVarN.f21132b;
                            viewStructure.setDimens((int) f10, (int) f11, 0, 0, (int) (eVarN.f21133c - f10), (int) (eVarN.f21134d - f11));
                            eVar = eVar2;
                        }
                    }
                }
            }
            if (eVar != null) {
                this.f16651d.add(new m(i12, this.f16658l, n.f16680a, eVar));
            }
            b(tVar, new d());
        }
    }

    public final void j(t tVar) {
        if (d()) {
            this.f16651d.add(new m(tVar.f21814g, this.f16658l, n.f16681b, null));
            List listH = t.h(4, tVar);
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                j((t) listH.get(i10));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16656j.removeCallbacks(this.f16662q);
        this.f16650c = null;
    }

    @Override // androidx.lifecycle.e
    public final void z(androidx.lifecycle.t tVar) {
        j(this.f16648a.getSemanticsOwner().a());
        e();
        this.f16650c = null;
    }
}
