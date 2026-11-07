package h9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$deleteKeystore$2", f = "KeystoreViewModel.kt", l = {87, 90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12905a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f12907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f12908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m9.t f12909e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$deleteKeystore$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m9.t f12910a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f12911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m9.t tVar, Object obj, tg.e eVar) {
            super(2, eVar);
            this.f12910a = tVar;
            this.f12911b = obj;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12910a, this.f12911b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            String message;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            m9.t tVar = this.f12910a;
            Context context = tVar.f17934b;
            KeystoreEntity keystoreEntity = (KeystoreEntity) tVar.f17935c;
            Object obj2 = this.f12911b;
            Throwable thA = pg.p.a(obj2);
            if (thA == null) {
                message = context.getString(R.string.keystore_deleted, keystoreEntity.getAlias());
                kotlin.jvm.internal.r.d(message, "getString(...)");
            } else {
                message = thA.getMessage();
                if (message == null) {
                    message = context.getString(R.string.keystore_operation_failed);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
            }
            Toast.makeText(context, message, 0).show();
            pg.f0 f0Var = pg.f0.f21461a;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, KeystoreEntity keystoreEntity, m9.t tVar, tg.e eVar) {
        super(2, eVar);
        this.f12907c = xVar;
        this.f12908d = keystoreEntity;
        this.f12909e = tVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z zVar = new z(this.f12907c, this.f12908d, this.f12909e, eVar);
        zVar.f12906b = obj;
        return zVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (ph.h.e(r1, r4, r6) == r0) goto L25;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f12905a;
        try {
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (i10 == 0) {
            pg.q.b(obj);
            x xVar = this.f12907c;
            KeystoreEntity keystoreEntity = this.f12908d;
            n8.l lVar = xVar.f12857b;
            this.f12905a = 1;
            lVar.getClass();
            wh.c cVar = ph.z0.f21632a;
            Object objE = ph.h.e(wh.b.f31563c, new n8.j(keystoreEntity, lVar, null), this);
            if (objE != obj2) {
                objE = pg.f0.f21461a;
            }
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
        }
        objA = pg.f0.f21461a;
        wh.c cVar2 = ph.z0.f21632a;
        qh.g gVar = uh.o.f29764a;
        a aVar = new a(this.f12909e, objA, null);
        this.f12905a = 2;
    }
}
