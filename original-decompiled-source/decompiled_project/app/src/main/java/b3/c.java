package b3;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import b3.b;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import eh.r;
import f3.t;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.jvm.internal.s;
import mh.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.d2;
import q1.e2;
import q1.i2;
import q1.u0;
import t2.b;
import t2.b0;
import t2.l0;
import t2.q;
import t2.u;
import t2.x;
import u2.v;
import x0.r3;
import x2.a0;
import x2.f;
import x2.o;
import x2.p;

/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f3537b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b.c<? extends b.a>> f3538c;

    /* renamed from: d, reason: collision with root package name */
    public final List<b.c<u>> f3539d;

    /* renamed from: e, reason: collision with root package name */
    public final f.a f3540e;

    /* renamed from: f, reason: collision with root package name */
    public final f3.d f3541f;

    /* renamed from: g, reason: collision with root package name */
    public final d f3542g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f3543h;

    /* renamed from: i, reason: collision with root package name */
    public final v f3544i;

    /* renamed from: j, reason: collision with root package name */
    public m f3545j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3546k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3547l;

    public static final class a extends s implements r<x2.f, p, x2.n, o, Typeface> {
        public a() {
            super(4);
        }

        @Override // eh.r
        public final Typeface f(x2.f fVar, p pVar, x2.n nVar, o oVar) {
            int i10 = nVar.f32027a;
            int i11 = oVar.f32028a;
            c cVar = c.this;
            a0 a0VarA = cVar.f3540e.a(fVar, pVar, i10, i11);
            if (a0VarA instanceof a0.a) {
                Object obj = ((a0.a) a0VarA).f32011a;
                kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj;
            }
            m mVar = new m(a0VarA, cVar.f3545j);
            cVar.f3545j = mVar;
            Object obj2 = mVar.f3570c;
            kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x085c A[LOOP:6: B:422:0x085a->B:423:0x085c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x08af  */
    /* JADX WARN: Type inference failed for: r1v0, types: [b3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<t2.b$c<? extends t2.b$a>>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.util.Collection, java.util.List, java.util.List<? extends t2.b$c<? extends t2.b$a>>, java.util.List<t2.b$c<? extends t2.b$a>>] */
    /* JADX WARN: Type inference failed for: r7v33, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, l0 l0Var, List<? extends b.c<? extends b.a>> list, List<b.c<u>> list2, f.a aVar, f3.d dVar) {
        Locale locale;
        int i10;
        Object obj;
        a aVar2;
        boolean z10;
        a aVar3;
        ?? arrayList;
        CharSequence charSequence;
        long j10;
        int i11;
        e3.n nVar;
        t2.s sVar;
        long j11;
        ArrayList arrayList2;
        int size;
        int i12;
        ArrayList arrayList3;
        b0 b0Var;
        int i13;
        int size2;
        int i14;
        boolean z11;
        e3.n nVar2;
        int size3;
        int i15;
        c cVar;
        int i16;
        int i17;
        int i18;
        int i19;
        t2.s sVar2;
        int i20;
        int i21;
        long j12;
        t2.v vVar;
        CharSequence charSequence2;
        a3.c cVar2;
        ?? obj2 = new Object();
        obj2.f3536a = str;
        obj2.f3537b = l0Var;
        obj2.f3538c = list;
        obj2.f3539d = list2;
        obj2.f3540e = aVar;
        obj2.f3541f = dVar;
        float density = dVar.getDensity();
        d dVar2 = new d(1);
        ((TextPaint) dVar2).density = density;
        dVar2.f3550b = e3.i.f8364b;
        dVar2.f3551c = 3;
        dVar2.f3552d = e2.f21687d;
        obj2.f3542g = dVar2;
        x xVar = l0Var.f27854c;
        g gVar = i.f3565a;
        g gVar2 = i.f3565a;
        r3<Boolean> r3VarA = gVar2.f3561a;
        if (r3VarA == null) {
            if (androidx.emoji2.text.d.d()) {
                r3VarA = gVar2.a();
                gVar2.f3561a = r3VarA;
            } else {
                r3VarA = j.f3566a;
            }
        }
        obj2.f3546k = r3VarA.getValue().booleanValue();
        int i22 = l0Var.f27853b.f27876b;
        a3.c cVar3 = l0Var.f27852a.f27785k;
        if (i22 != 4) {
            if (i22 != 5) {
                if (i22 == 1) {
                    i10 = 0;
                } else if (i22 == 2) {
                    i10 = 1;
                } else {
                    if (i22 != 3 && i22 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((cVar3 == null || (locale = cVar3.f25a.get(0).f23a) == null) ? Locale.getDefault() : locale);
                    i10 = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        obj2.f3547l = i10;
        a aVar4 = new a();
        e3.o oVar = l0Var.f27853b.f27883i;
        oVar = oVar == null ? e3.o.f8378c : oVar;
        dVar2.setFlags(oVar.f8381b ? dVar2.getFlags() | 128 : dVar2.getFlags() & (-129));
        int i23 = oVar.f8380a;
        if (i23 == 1) {
            dVar2.setFlags(dVar2.getFlags() | 64);
            dVar2.setHinting(0);
        } else if (i23 == 2) {
            dVar2.getFlags();
            dVar2.setHinting(1);
        } else if (i23 == 3) {
            dVar2.getFlags();
            dVar2.setHinting(0);
        } else {
            dVar2.getFlags();
        }
        b0 b0Var2 = l0Var.f27852a;
        int size4 = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i24);
            if (((b.c) obj).f27771a instanceof b0) {
                break;
            } else {
                i24++;
            }
        }
        boolean z12 = obj != null;
        long j13 = b0Var2.f27776b;
        String str2 = b0Var2.f27781g;
        a3.c cVar4 = b0Var2.f27785k;
        e3.l lVar = b0Var2.f27775a;
        e3.m mVar = b0Var2.f27784j;
        long j14 = b0Var2.f27782h;
        long jB = t.b(j13);
        if (f3.v.a(jB, 4294967296L)) {
            dVar2.setTextSize(dVar.r1(j13));
        } else if (f3.v.a(jB, 8589934592L)) {
            dVar2.setTextSize(t.c(j13) * dVar2.getTextSize());
        }
        x2.f fVar = b0Var2.f27780f;
        if (fVar == null && b0Var2.f27778d == null && b0Var2.f27777c == null) {
            aVar2 = aVar4;
        } else {
            p pVar = b0Var2.f27777c;
            pVar = pVar == null ? p.f32030c : pVar;
            x2.n nVar3 = b0Var2.f27778d;
            x2.n nVar4 = new x2.n(nVar3 != null ? nVar3.f32027a : 0);
            o oVar2 = b0Var2.f27779e;
            o oVar3 = new o(oVar2 != null ? oVar2.f32028a : 65535);
            aVar2 = aVar4;
            dVar2.setTypeface((Typeface) aVar2.f(fVar, pVar, nVar4, oVar3));
        }
        if (cVar4 != null) {
            a3.c cVar5 = a3.c.f24c;
            a3.a aVar5 = a3.d.f27a;
            aVar5.getClass();
            LocaleList localeList = LocaleList.getDefault();
            synchronized (aVar5.f22c) {
                cVar2 = aVar5.f21b;
                if (cVar2 == null || localeList != aVar5.f20a) {
                    int size5 = localeList.size();
                    ArrayList arrayList4 = new ArrayList(size5);
                    z10 = z12;
                    int i25 = 0;
                    while (i25 < size5) {
                        arrayList4.add(new a3.b(localeList.get(i25)));
                        i25++;
                        size5 = size5;
                        aVar2 = aVar2;
                    }
                    aVar3 = aVar2;
                    a3.c cVar6 = new a3.c(arrayList4);
                    aVar5.f20a = localeList;
                    aVar5.f21b = cVar6;
                    cVar2 = cVar6;
                } else {
                    z10 = z12;
                    aVar3 = aVar2;
                }
            }
            if (!cVar4.equals(cVar2)) {
                ArrayList arrayList5 = new ArrayList(qg.p.h(cVar4, 10));
                Iterator<a3.b> it = cVar4.f25a.iterator();
                while (it.hasNext()) {
                    arrayList5.add(it.next().f23a);
                }
                Locale[] localeArr = (Locale[]) arrayList5.toArray(new Locale[0]);
                dVar2.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        } else {
            z10 = z12;
            aVar3 = aVar2;
        }
        if (str2 != null && !str2.equals("")) {
            dVar2.setFontFeatureSettings(str2);
        }
        if (mVar != null && !mVar.equals(e3.m.f8372c)) {
            dVar2.setTextScaleX(dVar2.getTextScaleX() * mVar.f8373a);
            dVar2.setTextSkewX(dVar2.getTextSkewX() + mVar.f8374b);
        }
        dVar2.d(lVar.j());
        dVar2.c(lVar.l(), 9205357640488583168L, lVar.i());
        dVar2.f(b0Var2.f27788n);
        dVar2.g(b0Var2.f27787m);
        dVar2.e(b0Var2.f27790p);
        if (f3.v.a(t.b(j14), 4294967296L) && t.c(j14) != CropImageView.DEFAULT_ASPECT_RATIO) {
            float textScaleX = dVar2.getTextScaleX() * dVar2.getTextSize();
            float fR1 = dVar.r1(j14);
            if (textScaleX != CropImageView.DEFAULT_ASPECT_RATIO) {
                dVar2.setLetterSpacing(fR1 / textScaleX);
            }
        } else if (f3.v.a(t.b(j14), 8589934592L)) {
            dVar2.setLetterSpacing(t.c(j14));
        }
        long j15 = b0Var2.f27786l;
        e3.a aVar6 = b0Var2.f27783i;
        boolean z13 = z10 && f3.v.a(t.b(j14), 4294967296L) && t.c(j14) != CropImageView.DEFAULT_ASPECT_RATIO;
        long j16 = b1.f21654h;
        boolean z14 = (b1.d(j15, j16) || b1.d(j15, b1.f21653g)) ? false : true;
        boolean z15 = (aVar6 == null || Float.compare(aVar6.f8345a, CropImageView.DEFAULT_ASPECT_RATIO) == 0) ? false : true;
        b0 b0Var3 = (z13 || z14 || z15) ? new b0(0L, 0L, (p) null, (x2.n) null, (o) null, (x2.f) null, (String) null, z13 ? j14 : t.f8833c, z15 ? aVar6 : null, (e3.m) null, (a3.c) null, z14 ? j15 : j16, (e3.i) null, (e2) null, 63103) : null;
        if (b0Var3 != null) {
            int size6 = obj2.f3538c.size() + 1;
            arrayList = new ArrayList(size6);
            int i26 = 0;
            while (i26 < size6) {
                arrayList.add(i26 == 0 ? new b.c<>(b0Var3, 0, obj2.f3536a.length()) : obj2.f3538c.get(i26 - 1));
                i26++;
            }
        } else {
            arrayList = obj2.f3538c;
        }
        String str3 = obj2.f3536a;
        float textSize = obj2.f3542g.getTextSize();
        l0 l0Var2 = obj2.f3537b;
        List<b.c<u>> list3 = obj2.f3539d;
        f3.d dVar3 = obj2.f3541f;
        boolean z16 = obj2.f3546k;
        b.a aVar7 = b.f3535a;
        if (z16 && androidx.emoji2.text.d.d()) {
            x xVar2 = l0Var2.f27854c;
            if (xVar2 != null) {
                t2.v vVar2 = xVar2.f27890b;
            }
            CharSequence charSequenceG = androidx.emoji2.text.d.a().g(0, str3.length(), 0, str3);
            kotlin.jvm.internal.r.b(charSequenceG);
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (arrayList.isEmpty() && list3.isEmpty() && kotlin.jvm.internal.r.a(l0Var2.f27853b.f27878d, e3.n.f8375c)) {
            cVar = obj2;
            charSequence2 = charSequence;
            if ((l0Var2.f27853b.f27877c & 1095216660480L) != 0) {
            }
        } else {
            SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            b0 b0Var4 = l0Var2.f27852a;
            t2.s sVar3 = l0Var2.f27853b;
            if (kotlin.jvm.internal.r.a(b0Var4.f27787m, e3.i.f8365c)) {
                spannableString.setSpan(b.f3535a, 0, str3.length(), 33);
            }
            x xVar3 = l0Var2.f27854c;
            if (((xVar3 == null || (vVar = xVar3.f27890b) == null) ? false : vVar.f27887a) && sVar3.f27880f == null) {
                j10 = 1095216660480L;
                float fB = c3.b.b(sVar3.f27877c, textSize, dVar3);
                if (!Float.isNaN(fB)) {
                    spannableString.setSpan(new w2.g(fB), 0, spannableString.length(), 33);
                }
            } else {
                j10 = 1095216660480L;
                e3.f fVar2 = sVar3.f27880f;
                fVar2 = fVar2 == null ? e3.f.f8352c : fVar2;
                float fB2 = c3.b.b(sVar3.f27877c, textSize, dVar3);
                if (!Float.isNaN(fB2)) {
                    int length = (spannableString.length() == 0 || y.a0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i27 = fVar2.f8354b;
                    i11 = 0;
                    spannableString.setSpan(new w2.h(fB2, length, (i27 & 1) > 0, (i27 & 16) > 0, fVar2.f8353a, false), 0, spannableString.length(), 33);
                }
                nVar = sVar3.f27878d;
                if (nVar == null) {
                    long j17 = nVar.f8376a;
                    j11 = 0;
                    long j18 = nVar.f8377b;
                    if ((t.a(j17, f3.u.c(i11)) && t.a(j18, f3.u.c(i11))) || (j17 & j10) == 0 || (j18 & j10) == 0) {
                        sVar = sVar3;
                    } else {
                        long jB2 = t.b(j17);
                        sVar = sVar3;
                        float fR12 = f3.v.a(jB2, 4294967296L) ? dVar3.r1(j17) : f3.v.a(jB2, 8589934592L) ? t.c(j17) * textSize : 0.0f;
                        long jB3 = t.b(j18);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fR12), (int) Math.ceil(f3.v.a(jB3, 4294967296L) ? dVar3.r1(j18) : f3.v.a(jB3, 8589934592L) ? t.c(j18) * textSize : 0.0f)), 0, spannableString.length(), 33);
                    }
                } else {
                    sVar = sVar3;
                    j11 = 0;
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                for (i12 = 0; i12 < size; i12++) {
                    b.c cVar7 = (b.c) arrayList.get(i12);
                    Object obj3 = cVar7.f27771a;
                    if (obj3 instanceof b0) {
                        b0 b0Var5 = (b0) obj3;
                        if (((b0Var5.f27780f == null && b0Var5.f27778d == null && b0Var5.f27777c == null) ? false : true) || ((b0) obj3).f27779e != null) {
                            arrayList2.add(cVar7);
                        }
                    }
                }
                b0 b0Var6 = l0Var2.f27852a;
                x2.f fVar3 = b0Var6.f27780f;
                b0 b0Var7 = ((fVar3 == null || b0Var6.f27778d != null || b0Var6.f27777c != null) && b0Var6.f27779e == null) ? null : new b0(0L, 0L, b0Var6.f27777c, b0Var6.f27778d, b0Var6.f27779e, fVar3, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, (e3.i) null, (e2) null, 65475);
                c3.a aVar8 = new c3.a(spannableString, aVar3);
                if (arrayList2.size() <= 1) {
                    int size7 = arrayList2.size();
                    int i28 = size7 * 2;
                    int[] iArr = new int[i28];
                    int size8 = arrayList2.size();
                    for (int i29 = 0; i29 < size8; i29++) {
                        b.c cVar8 = (b.c) arrayList2.get(i29);
                        iArr[i29] = cVar8.f27772b;
                        iArr[i29 + size7] = cVar8.f27773c;
                    }
                    if (i28 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i28 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    int i30 = iArr[0];
                    int i31 = 0;
                    while (i31 < i28) {
                        int i32 = iArr[i31];
                        if (i32 == i30) {
                            arrayList3 = arrayList2;
                            b0Var = b0Var7;
                            i13 = i31;
                        } else {
                            int size9 = arrayList2.size();
                            b0 b0VarC = b0Var7;
                            int i33 = 0;
                            while (i33 < size9) {
                                ArrayList arrayList6 = arrayList2;
                                b.c cVar9 = (b.c) arrayList2.get(i33);
                                b0 b0Var8 = b0Var7;
                                int i34 = cVar9.f27772b;
                                int i35 = i31;
                                int i36 = cVar9.f27773c;
                                if (i34 != i36 && t2.e.b(i30, i32, i34, i36)) {
                                    b0 b0Var9 = (b0) cVar9.f27771a;
                                    b0VarC = b0VarC != null ? b0VarC.c(b0Var9) : b0Var9;
                                }
                                i33++;
                                b0Var7 = b0Var8;
                                arrayList2 = arrayList6;
                                i31 = i35;
                            }
                            arrayList3 = arrayList2;
                            b0Var = b0Var7;
                            i13 = i31;
                            if (b0VarC != null) {
                                aVar8.b(b0VarC, Integer.valueOf(i30), Integer.valueOf(i32));
                            }
                            i30 = i32;
                        }
                        i31 = i13 + 1;
                        b0Var7 = b0Var;
                        arrayList2 = arrayList3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    b0 b0Var10 = (b0) ((b.c) arrayList2.get(0)).f27771a;
                    aVar8.b(b0Var7 != null ? b0Var7.c(b0Var10) : b0Var10, Integer.valueOf(((b.c) arrayList2.get(0)).f27772b), Integer.valueOf(((b.c) arrayList2.get(0)).f27773c));
                }
                size2 = arrayList.size();
                i14 = 0;
                z11 = false;
                while (i14 < size2) {
                    b.c cVar10 = (b.c) arrayList.get(i14);
                    Object obj4 = cVar10.f27771a;
                    if (obj4 instanceof b0) {
                        int i37 = cVar10.f27772b;
                        int i38 = cVar10.f27773c;
                        if (i37 < 0 || i37 >= spannableString.length() || i38 <= i37 || i38 > spannableString.length()) {
                            i18 = size2;
                            i19 = i14;
                            sVar2 = sVar;
                        } else {
                            b0 b0Var11 = (b0) obj4;
                            long j19 = b0Var11.f27782h;
                            e3.a aVar9 = b0Var11.f27783i;
                            e3.l lVar2 = b0Var11.f27775a;
                            if (aVar9 != null) {
                                spannableString.setSpan(new w2.a(aVar9.f8345a), i37, i38, 33);
                            }
                            i18 = size2;
                            i19 = i14;
                            c3.b.c(spannableString, lVar2.j(), i37, i38);
                            u0 u0VarL = lVar2.l();
                            float fI = lVar2.i();
                            if (u0VarL != null) {
                                if (u0VarL instanceof i2) {
                                    c3.b.c(spannableString, ((i2) u0VarL).f21711a, i37, i38);
                                } else {
                                    spannableString.setSpan(new d3.c((d2) u0VarL, fI), i37, i38, 33);
                                }
                            }
                            e3.i iVar = b0Var11.f27787m;
                            if (iVar != null) {
                                int i39 = iVar.f8367a;
                                w2.l lVar3 = new w2.l((i39 | 1) == i39, (i39 | 2) == i39);
                                i20 = 33;
                                spannableString.setSpan(lVar3, i37, i38, 33);
                            } else {
                                i20 = 33;
                            }
                            int i40 = i20;
                            sVar2 = sVar;
                            c3.b.d(spannableString, b0Var11.f27776b, dVar3, i37, i38);
                            String str4 = b0Var11.f27781g;
                            if (str4 != null) {
                                spannableString.setSpan(new w2.b(str4), i37, i38, i40);
                            }
                            e3.m mVar2 = b0Var11.f27784j;
                            if (mVar2 != null) {
                                spannableString.setSpan(new ScaleXSpan(mVar2.f8373a), i37, i38, i40);
                                spannableString.setSpan(new w2.k(mVar2.f8374b), i37, i38, i40);
                            }
                            c3.b.e(spannableString, b0Var11.f27785k, i37, i38);
                            long j20 = b0Var11.f27786l;
                            if (j20 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(n0.j(j20)), i37, i38, i40);
                            }
                            e2 e2Var = b0Var11.f27788n;
                            if (e2Var != null) {
                                long j21 = e2Var.f21689b;
                                int iJ = n0.j(e2Var.f21688a);
                                j12 = j19;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j21 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j21 & BodyPartID.bodyIdMax));
                                float f10 = e2Var.f21690c;
                                w2.j jVar = new w2.j(fIntBitsToFloat, fIntBitsToFloat2, f10 == CropImageView.DEFAULT_ASPECT_RATIO ? Float.MIN_VALUE : f10, iJ);
                                i21 = 33;
                                spannableString.setSpan(jVar, i37, i38, 33);
                            } else {
                                i21 = i40;
                                j12 = j19;
                            }
                            s1.f fVar4 = b0Var11.f27790p;
                            if (fVar4 != null) {
                                spannableString.setSpan(new d3.b(fVar4), i37, i38, i21);
                            }
                            if (f3.v.a(t.b(j12), 4294967296L) || f3.v.a(t.b(j12), 8589934592L)) {
                                z11 = true;
                            }
                        }
                    }
                    i14 = i19 + 1;
                    sVar = sVar2;
                    size2 = i18;
                }
                t2.s sVar4 = sVar;
                if (z11) {
                    int size10 = arrayList.size();
                    int i41 = 0;
                    while (i41 < size10) {
                        b.c cVar11 = (b.c) arrayList.get(i41);
                        b.a aVar10 = (b.a) cVar11.f27771a;
                        if (aVar10 instanceof b0) {
                            int i42 = cVar11.f27772b;
                            int i43 = cVar11.f27773c;
                            if (i42 < 0 || i42 >= spannableString.length() || i43 <= i42 || i43 > spannableString.length()) {
                                i16 = size10;
                                i17 = i41;
                            } else {
                                long j22 = ((b0) aVar10).f27782h;
                                long jB4 = t.b(j22);
                                i16 = size10;
                                i17 = i41;
                                Object fVar5 = f3.v.a(jB4, 4294967296L) ? new w2.f(dVar3.r1(j22)) : f3.v.a(jB4, 8589934592L) ? new w2.e(t.c(j22)) : null;
                                if (fVar5 != null) {
                                    spannableString.setSpan(fVar5, i42, i43, 33);
                                }
                            }
                        }
                        i41 = i17 + 1;
                        size10 = i16;
                    }
                }
                nVar2 = sVar4.f27878d;
                if (nVar2 != null) {
                    long j23 = nVar2.f8376a;
                    long jB5 = t.b(j23);
                    if (f3.v.a(jB5, 4294967296L)) {
                        dVar3.r1(j23);
                    } else if (f3.v.a(jB5, 8589934592L)) {
                        t.c(j23);
                    }
                }
                size3 = arrayList.size();
                for (i15 = 0; i15 < size3; i15++) {
                    Object obj5 = ((b.c) arrayList.get(i15)).f27771a;
                }
                if (list3.size() <= 0) {
                    b.c<u> cVar12 = list3.get(0);
                    u uVar = cVar12.f27771a;
                    for (Object obj6 : spannableString.getSpans(cVar12.f27772b, cVar12.f27773c, x4.g.class)) {
                        spannableString.removeSpan((x4.g) obj6);
                    }
                    uVar.getClass();
                    t.c(j11);
                    t.b(j11);
                    t.c(j11);
                    t.b(j11);
                    dVar3.G0();
                    dVar3.getDensity();
                    throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                }
                cVar = this;
                charSequence2 = spannableString;
            }
            i11 = 0;
            nVar = sVar3.f27878d;
            if (nVar == null) {
            }
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            while (i12 < size) {
            }
            b0 b0Var62 = l0Var2.f27852a;
            x2.f fVar32 = b0Var62.f27780f;
            if (fVar32 == null) {
                if (fVar32 == null || b0Var62.f27778d != null || b0Var62.f27777c != null) {
                    c3.a aVar82 = new c3.a(spannableString, aVar3);
                    if (arrayList2.size() <= 1) {
                    }
                    size2 = arrayList.size();
                    i14 = 0;
                    z11 = false;
                    while (i14 < size2) {
                    }
                    t2.s sVar42 = sVar;
                    if (z11) {
                    }
                    nVar2 = sVar42.f27878d;
                    if (nVar2 != null) {
                    }
                    size3 = arrayList.size();
                    while (i15 < size3) {
                    }
                    if (list3.size() <= 0) {
                    }
                }
            }
        }
        cVar.f3543h = charSequence2;
        cVar.f3544i = new v(charSequence2, cVar.f3542g, cVar.f3547l);
    }

    @Override // t2.q
    public final boolean a() {
        m mVar = this.f3545j;
        if (mVar != null ? mVar.a() : false) {
            return true;
        }
        if (!this.f3546k) {
            x xVar = this.f3537b.f27854c;
            g gVar = i.f3565a;
            g gVar2 = i.f3565a;
            r3<Boolean> r3VarA = gVar2.f3561a;
            if (r3VarA == null) {
                if (androidx.emoji2.text.d.d()) {
                    r3VarA = gVar2.a();
                    gVar2.f3561a = r3VarA;
                } else {
                    r3VarA = j.f3566a;
                }
            }
            if (r3VarA.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t2.q
    public final float b() {
        float f10;
        v vVar = this.f3544i;
        float f11 = vVar.f29239e;
        TextPaint textPaint = vVar.f29236b;
        if (!Float.isNaN(f11)) {
            return vVar.f29239e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = vVar.f29235a;
        lineInstance.setText(new u2.q(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new u2.u());
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new pg.n(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                pg.n nVar = (pg.n) priorityQueue.peek();
                if (nVar != null && ((Number) nVar.f21470b).intValue() - ((Number) nVar.f21469a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new pg.n(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            pg.n nVar2 = (pg.n) it.next();
            float desiredWidth = Layout.getDesiredWidth(vVar.b(), ((Number) nVar2.f21469a).intValue(), ((Number) nVar2.f21470b).intValue(), textPaint);
            while (it.hasNext()) {
                pg.n nVar3 = (pg.n) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(vVar.b(), ((Number) nVar3.f21469a).intValue(), ((Number) nVar3.f21470b).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        vVar.f29239e = f10;
        return f10;
    }

    @Override // t2.q
    public final float c() {
        return this.f3544i.c();
    }
}
