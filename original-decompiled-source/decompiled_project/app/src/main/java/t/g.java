package t;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class g implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final f3.d f25228a;

    /* renamed from: b, reason: collision with root package name */
    public long f25229b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f25230c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f25231d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25232e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25233f;

    /* renamed from: g, reason: collision with root package name */
    public long f25234g;

    /* renamed from: h, reason: collision with root package name */
    public long f25235h;

    /* renamed from: i, reason: collision with root package name */
    public final i2.m f25236i;

    public static final class a implements PointerInputEventHandler {

        @vg.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
        /* renamed from: t.g$a$a, reason: collision with other inner class name */
        public static final class C0282a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25238a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f25239b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f25240c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0282a(g gVar, tg.e<? super C0282a> eVar) {
                super(2, eVar);
                this.f25240c = gVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0282a c0282a = new C0282a(this.f25240c, eVar);
                c0282a.f25239b = obj;
                return c0282a;
            }

            @Override // eh.p
            public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
                return ((C0282a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                if (r12 == r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
            
                if (r12 != r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
            
                return r0;
             */
            /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:17:0x0050). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                c2.c cVar;
                Object obj2;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f25238a;
                g gVar = this.f25240c;
                if (i10 == 0) {
                    pg.q.b(obj);
                    cVar = (c2.c) this.f25239b;
                    this.f25239b = cVar;
                    this.f25238a = 1;
                    obj = v.t1.c(cVar, this, 2);
                } else if (i10 == 1) {
                    cVar = (c2.c) this.f25239b;
                    pg.q.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c2.c) this.f25239b;
                    pg.q.b(obj);
                    ?? r12 = ((c2.r) obj).f4687a;
                    ArrayList arrayList = new ArrayList(r12.size());
                    int size = r12.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        Object obj3 = r12.get(i12);
                        if (((c2.b0) obj3).f4596d) {
                            arrayList.add(obj3);
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        if (i11 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i11);
                        if (b0.a0.b(((c2.b0) obj2).f4593a, gVar.f25235h)) {
                            break;
                        }
                        i11++;
                    }
                    c2.b0 b0Var = (c2.b0) obj2;
                    if (b0Var == null) {
                        b0Var = (c2.b0) qg.x.D(arrayList);
                    }
                    if (b0Var != null) {
                        gVar.f25235h = b0Var.f4593a;
                        gVar.f25229b = b0Var.f4595c;
                    }
                    if (arrayList.isEmpty()) {
                        gVar.f25235h = -1L;
                        return pg.f0.f21461a;
                    }
                    this.f25239b = cVar;
                    this.f25238a = 2;
                    obj = cVar.C1(c2.t.f4695b, this);
                }
                c2.b0 b0Var2 = (c2.b0) obj;
                gVar.f25235h = b0Var2.f4593a;
                gVar.f25229b = b0Var2.f4595c;
                this.f25239b = cVar;
                this.f25238a = 2;
                obj = cVar.C1(c2.t.f4695b, this);
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objC = v.c0.c(j0Var, new C0282a(g.this, null), eVar);
            return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
        }
    }

    public g(Context context, f3.d dVar, long j10, z.f1 f1Var) {
        this.f25228a = dVar;
        i0 i0Var = new i0(context, c2.n0.j(j10));
        this.f25230c = i0Var;
        this.f25231d = new x0.x1(pg.f0.f21461a, x0.q1.f31878a);
        this.f25232e = true;
        this.f25234g = 0L;
        this.f25235h = -1L;
        a aVar = new a();
        c2.r rVar = c2.s0.f4692a;
        c2.y0 y0Var = new c2.y0(null, null, aVar);
        this.f25236i = Build.VERSION.SDK_INT >= 31 ? new a2(y0Var, this, i0Var) : new o0(y0Var, this, i0Var, f1Var);
    }

    @Override // t.i1
    public final i2.j B() {
        return this.f25236i;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[PHI: r7
      0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    @Override // t.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j10, int i10, eh.l<? super p1.c, p1.c> lVar) {
        long j11;
        float fIntBitsToFloat;
        int i11;
        float fI;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jF;
        boolean z10;
        boolean zF;
        long j12;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        if (p1.h.e(this.f25234g)) {
            return lVar.invoke(new p1.c(j10)).f21129a;
        }
        boolean z13 = this.f25233f;
        boolean z14 = true;
        i0 i0Var = this.f25230c;
        if (!z13) {
            if (i0.g(i0Var.f25258f)) {
                h(0L);
            }
            if (i0.g(i0Var.f25259g)) {
                i(0L);
            }
            if (i0.g(i0Var.f25256d)) {
                j(0L);
            }
            if (i0.g(i0Var.f25257e)) {
                g(0L);
            }
            this.f25233f = true;
        }
        int i13 = i.f25252a;
        float f12 = i10 == 2 ? 4.0f : 1.0f;
        long jH = p1.c.h(f12, j10);
        int i14 = (int) (j10 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i14) != CropImageView.DEFAULT_ASPECT_RATIO) {
            if (!i0.g(i0Var.f25256d) || Float.intBitsToFloat(i14) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                j11 = 4294967295L;
                if (i0.g(i0Var.f25257e) && Float.intBitsToFloat(i14) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    float fG = g(jH);
                    if (!i0.g(i0Var.f25257e)) {
                        i0Var.b().finish();
                    }
                    fIntBitsToFloat = fG == Float.intBitsToFloat((int) (jH & BodyPartID.bodyIdMax)) ? Float.intBitsToFloat(i14) : fG / f12;
                }
            } else {
                float fJ = j(jH);
                j11 = 4294967295L;
                if (!i0.g(i0Var.f25256d)) {
                    i0Var.e().finish();
                }
                fIntBitsToFloat = fJ == Float.intBitsToFloat((int) (jH & BodyPartID.bodyIdMax)) ? Float.intBitsToFloat(i14) : fJ / f12;
            }
            i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (i0.g(i0Var.f25258f) && Float.intBitsToFloat(i11) < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fI = h(jH);
                    if (!i0.g(i0Var.f25258f)) {
                        i0Var.c().finish();
                    }
                    if (fI == Float.intBitsToFloat((int) (jH >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                    }
                } else if (!i0.g(i0Var.f25259g) || Float.intBitsToFloat(i11) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fI = i(jH);
                    if (!i0.g(i0Var.f25259g)) {
                        i0Var.d().finish();
                    }
                    fIntBitsToFloat2 = fI == Float.intBitsToFloat((int) (jH >> 32)) ? Float.intBitsToFloat(i11) : fI / f12;
                }
            }
            jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & j11);
            if (!p1.c.b(jFloatToRawIntBits, 0L)) {
                f();
            }
            jF = p1.c.f(j10, jFloatToRawIntBits);
            long j13 = lVar.invoke(new p1.c(jF)).f21129a;
            long jF2 = p1.c.f(jF, j13);
            if ((Float.intBitsToFloat((int) (jF >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (jF & j11)) != CropImageView.DEFAULT_ASPECT_RATIO) && ((Float.intBitsToFloat((int) (j13 >> 32)) != CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (j13 & j11)) != CropImageView.DEFAULT_ASPECT_RATIO) && (i0.g(i0Var.f25258f) || i0.g(i0Var.f25256d) || i0.g(i0Var.f25259g) || i0.g(i0Var.f25257e)))) {
                d();
            }
            if (i10 != 1) {
                int i15 = (int) (jF2 >> 32);
                if (Float.intBitsToFloat(i15) > 0.5f) {
                    j12 = jF2;
                    h(j12);
                } else {
                    j12 = jF2;
                    if (Float.intBitsToFloat(i15) < -0.5f) {
                        i(j12);
                    } else {
                        f10 = 0.5f;
                        f11 = -0.5f;
                        z11 = false;
                        i12 = (int) (j12 & j11);
                        if (Float.intBitsToFloat(i12) <= f10) {
                            j(j12);
                        } else if (Float.intBitsToFloat(i12) < f11) {
                            g(j12);
                        } else {
                            z12 = false;
                            z10 = !z11 || z12;
                        }
                        z12 = true;
                        if (z11) {
                        }
                    }
                }
                z11 = true;
                f10 = 0.5f;
                f11 = -0.5f;
                i12 = (int) (j12 & j11);
                if (Float.intBitsToFloat(i12) <= f10) {
                }
                z12 = true;
                if (z11) {
                }
            }
            if (!p1.c.b(jF, 0L)) {
                if (!i0.f(i0Var.f25258f) || Float.intBitsToFloat(i11) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = i0Var.c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
                    if (edgeEffectC instanceof n0) {
                        n0 n0Var = (n0) edgeEffectC;
                        float f13 = n0Var.f25304b + fIntBitsToFloat3;
                        n0Var.f25304b = f13;
                        if (Math.abs(f13) > n0Var.f25303a) {
                            n0Var.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = i0.f(i0Var.f25258f);
                }
                if (i0.f(i0Var.f25259g) && Float.intBitsToFloat(i11) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    EdgeEffect edgeEffectD = i0Var.d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                    if (edgeEffectD instanceof n0) {
                        n0 n0Var2 = (n0) edgeEffectD;
                        float f14 = n0Var2.f25304b + fIntBitsToFloat4;
                        n0Var2.f25304b = f14;
                        if (Math.abs(f14) > n0Var2.f25303a) {
                            n0Var2.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    zF = zF || i0.f(i0Var.f25259g);
                }
                if (i0.f(i0Var.f25256d) && Float.intBitsToFloat(i14) < CropImageView.DEFAULT_ASPECT_RATIO) {
                    EdgeEffect edgeEffectE = i0Var.e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i14);
                    if (edgeEffectE instanceof n0) {
                        n0 n0Var3 = (n0) edgeEffectE;
                        float f15 = n0Var3.f25304b + fIntBitsToFloat5;
                        n0Var3.f25304b = f15;
                        if (Math.abs(f15) > n0Var3.f25303a) {
                            n0Var3.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    zF = zF || i0.f(i0Var.f25256d);
                }
                if (i0.f(i0Var.f25257e) && Float.intBitsToFloat(i14) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    EdgeEffect edgeEffectB = i0Var.b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i14);
                    if (edgeEffectB instanceof n0) {
                        n0 n0Var4 = (n0) edgeEffectB;
                        float f16 = n0Var4.f25304b + fIntBitsToFloat6;
                        n0Var4.f25304b = f16;
                        if (Math.abs(f16) > n0Var4.f25303a) {
                            n0Var4.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    zF = zF || i0.f(i0Var.f25257e);
                }
                if (!zF && !z10) {
                    z14 = false;
                }
                z10 = z14;
            }
            if (z10) {
                f();
            }
            return p1.c.g(jFloatToRawIntBits, j13);
        }
        j11 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) != CropImageView.DEFAULT_ASPECT_RATIO) {
        }
        jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & j11);
        if (!p1.c.b(jFloatToRawIntBits, 0L)) {
        }
        jF = p1.c.f(j10, jFloatToRawIntBits);
        long j132 = lVar.invoke(new p1.c(jF)).f21129a;
        long jF22 = p1.c.f(jF, j132);
        if (Float.intBitsToFloat((int) (jF >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO) {
            d();
        } else {
            d();
        }
        if (i10 != 1) {
        }
        if (!p1.c.b(jF, 0L)) {
        }
        if (z10) {
        }
        return p1.c.g(jFloatToRawIntBits, j132);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r14.invoke(r15, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j10, eh.p pVar, vg.c cVar) {
        f fVar;
        long jD;
        g gVar;
        long jD2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f25215e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f25215e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, cVar);
            }
        }
        Object objInvoke = fVar.f25213c;
        ug.a aVar = ug.a.f29706a;
        int i11 = fVar.f25215e;
        if (i11 == 0) {
            pg.q.b(objInvoke);
            if (p1.h.e(this.f25234g)) {
                f3.w wVar = new f3.w(j10);
                fVar.f25215e = 1;
            } else {
                i0 i0Var = this.f25230c;
                boolean zG = i0.g(i0Var.f25258f);
                f3.d dVar = this.f25228a;
                long jA = androidx.lifecycle.c1.a((!zG || f3.w.b(j10) >= CropImageView.DEFAULT_ASPECT_RATIO) ? (!i0.g(i0Var.f25259g) || f3.w.b(j10) <= CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : -g0.a(i0Var.d(), -f3.w.b(j10), Float.intBitsToFloat((int) (this.f25234g >> 32)), dVar) : g0.a(i0Var.c(), f3.w.b(j10), Float.intBitsToFloat((int) (this.f25234g >> 32)), dVar), (!i0.g(i0Var.f25256d) || f3.w.c(j10) >= CropImageView.DEFAULT_ASPECT_RATIO) ? (!i0.g(i0Var.f25257e) || f3.w.c(j10) <= CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : -g0.a(i0Var.b(), -f3.w.c(j10), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & this.f25234g)), dVar) : g0.a(i0Var.e(), f3.w.c(j10), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & this.f25234g)), dVar));
                if (jA != 0) {
                    f();
                }
                jD = f3.w.d(j10, jA);
                f3.w wVar2 = new f3.w(jD);
                fVar.f25211a = this;
                fVar.f25212b = jD;
                fVar.f25215e = 2;
                objInvoke = pVar.invoke(wVar2, fVar);
                if (objInvoke != aVar) {
                    gVar = this;
                    jD2 = f3.w.d(jD, ((f3.w) objInvoke).f8837a);
                    gVar.f25233f = false;
                    i0 i0Var2 = gVar.f25230c;
                    if (f3.w.b(jD2) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    if (f3.w.c(jD2) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    gVar.d();
                    return pg.f0.f21461a;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            pg.q.b(objInvoke);
            return pg.f0.f21461a;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jD = fVar.f25212b;
        gVar = fVar.f25211a;
        pg.q.b(objInvoke);
        jD2 = f3.w.d(jD, ((f3.w) objInvoke).f8837a);
        gVar.f25233f = false;
        i0 i0Var22 = gVar.f25230c;
        if (f3.w.b(jD2) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffectC = i0Var22.c();
            int iB = gh.a.b(f3.w.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iB);
            }
        } else if (f3.w.b(jD2) < CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffectD = i0Var22.d();
            int i12 = -gh.a.b(f3.w.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i12);
            }
        }
        if (f3.w.c(jD2) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffectE = i0Var22.e();
            int iB2 = gh.a.b(f3.w.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iB2);
            }
        } else if (f3.w.c(jD2) < CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffectB = i0Var22.b();
            int i13 = -gh.a.b(f3.w.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i13);
            }
        }
        gVar.d();
        return pg.f0.f21461a;
    }

    @Override // t.i1
    public final boolean c() {
        i0 i0Var = this.f25230c;
        EdgeEffect edgeEffect = i0Var.f25256d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? j.b(edgeEffect) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = i0Var.f25257e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? j.b(edgeEffect2) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = i0Var.f25258f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? j.b(edgeEffect3) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = i0Var.f25259g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? j.b(edgeEffect4) : 0.0f) != CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return false;
    }

    public final void d() {
        boolean z10;
        i0 i0Var = this.f25230c;
        EdgeEffect edgeEffect = i0Var.f25256d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = i0Var.f25257e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = i0Var.f25258f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = i0Var.f25259g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            f();
        }
    }

    public final long e() {
        long jD = this.f25229b;
        if ((9223372034707292159L & jD) == 9205357640488583168L) {
            jD = d0.h.d(this.f25234g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32)) / Float.intBitsToFloat((int) (this.f25234g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (this.f25234g & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.f25232e) {
            this.f25231d.setValue(pg.f0.f21461a);
        }
    }

    public final float g(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j10 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f25234g & BodyPartID.bodyIdMax));
        EdgeEffect edgeEffectB = this.f25230c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = j.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i11 >= 31 ? j.b(edgeEffectB) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & this.f25234g)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float h(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & BodyPartID.bodyIdMax));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f25234g >> 32));
        EdgeEffect edgeEffectC = this.f25230c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = j.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i11 >= 31 ? j.b(edgeEffectC) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f25234g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final float i(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & BodyPartID.bodyIdMax));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f25234g >> 32));
        EdgeEffect edgeEffectD = this.f25230c.d();
        float fC = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = j.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i11 >= 31 ? j.b(edgeEffectD) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f25234g >> 32)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float j(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j10 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f25234g & BodyPartID.bodyIdMax));
        EdgeEffect edgeEffectE = this.f25230c.e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = j.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? j.b(edgeEffectE) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f25234g & BodyPartID.bodyIdMax)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final void k(long j10) {
        boolean zA = p1.h.a(this.f25234g, 0L);
        boolean zA2 = p1.h.a(j10, this.f25234g);
        this.f25234g = j10;
        if (!zA2) {
            long jB = (gh.a.b(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (gh.a.b(Float.intBitsToFloat((int) (j10 >> 32))) << 32);
            i0 i0Var = this.f25230c;
            i0Var.f25255c = jB;
            EdgeEffect edgeEffect = i0Var.f25256d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect2 = i0Var.f25257e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect3 = i0Var.f25258f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & BodyPartID.bodyIdMax), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = i0Var.f25259g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & BodyPartID.bodyIdMax), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = i0Var.f25260h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect6 = i0Var.f25261i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax));
            }
            EdgeEffect edgeEffect7 = i0Var.f25262j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & BodyPartID.bodyIdMax), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = i0Var.f25263k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (BodyPartID.bodyIdMax & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }
}
