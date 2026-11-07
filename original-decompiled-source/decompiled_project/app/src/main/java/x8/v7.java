package x8;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class v7 implements b2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0.w0 f33294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.i1 f33295b;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectListOverscrollKt$rememberProjectListOverscroll$1$1", f = "ProjectListOverscroll.kt", l = {33}, m = "onPostFling-RZ2iAVY")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public long f33296a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f33297b;

        /* renamed from: d, reason: collision with root package name */
        public int f33299d;

        public a(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f33297b = obj;
            this.f33299d |= PKIFailureInfo.systemUnavail;
            return v7.this.x1(0L, 0L, this);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectListOverscrollKt$rememberProjectListOverscroll$1$1$onPostFling$2", f = "ProjectListOverscroll.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<f3.w, tg.e<? super f3.w>, Object> {
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(2, eVar);
        }

        @Override // eh.p
        public final Object invoke(f3.w wVar, tg.e<? super f3.w> eVar) {
            long j10 = wVar.f8837a;
            return new b(2, eVar).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return new f3.w(0L);
        }
    }

    public v7(c0.w0 w0Var, t.i1 i1Var) {
        this.f33294a = w0Var;
        this.f33295b = i1Var;
    }

    @Override // b2.a
    public final long n1(long j10, long j11, int i10) {
        t.i1 i1Var;
        c0.w0 w0Var = this.f33294a;
        if (w0Var.d() || w0Var.b() || (i1Var = this.f33295b) == null) {
            return 0L;
        }
        return i1Var.a((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)))), i10, new com.basitce.htmltoapk.data.apkgenerator.signer.e(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x1(long j10, long j11, tg.e<? super f3.w> eVar) {
        a aVar;
        t.i1 i1Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f33299d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f33299d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a((vg.c) eVar);
            }
        }
        Object obj = aVar.f33297b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f33299d;
        if (i11 == 0) {
            pg.q.b(obj);
            c0.w0 w0Var = this.f33294a;
            if (w0Var.d() || w0Var.b() || (i1Var = this.f33295b) == null) {
                return new f3.w(0L);
            }
            long jA = androidx.lifecycle.c1.a(CropImageView.DEFAULT_ASPECT_RATIO, f3.w.c(j11));
            b bVar = new b(2, null);
            aVar.f33296a = j11;
            aVar.f33299d = 1;
            if (i1Var.b(jA, bVar, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = aVar.f33296a;
            pg.q.b(obj);
        }
        return new f3.w(androidx.lifecycle.c1.a(CropImageView.DEFAULT_ASPECT_RATIO, f3.w.c(j11)));
    }
}
