package j2;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.eac.EACTags;
import rh.c;

@vg.e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public rh.w f14902a;

    /* renamed from: b, reason: collision with root package name */
    public rh.j f14903b;

    /* renamed from: c, reason: collision with root package name */
    public int f14904c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c f14905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(rh.c cVar, tg.e eVar) {
        super(2, eVar);
        this.f14905d = cVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t2(this.f14905d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:26:0x0058, B:14:0x0027, B:28:0x005b, B:30:0x0060, B:31:0x0061, B:32:0x0062, B:13:0x0021, B:21:0x004b, B:23:0x0051), top: B:44:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:26:0x0058, B:14:0x0027, B:28:0x005b, B:30:0x0060, B:31:0x0061, B:32:0x0062, B:13:0x0021, B:21:0x004b, B:23:0x0051), top: B:44:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [rh.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rh.c cVar;
        rh.j aVar;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f14904c;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = this.f14905d;
                aVar = new c.a();
                this.f14902a = cVar;
                this.f14903b = aVar;
                this.f14904c = 1;
                obj = aVar.a(this);
                cVar = cVar;
                if (obj == aVar2) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f14903b;
                ?? r42 = this.f14902a;
                pg.q.b(obj);
                cVar = r42;
                if (((Boolean) obj).booleanValue()) {
                    boolean z10 = false;
                    v2.f14929b.set(false);
                    synchronized (h1.n.f12160c) {
                        p.m0<h1.i0> m0Var = h1.n.f12167j.f12096h;
                        if (m0Var != null && m0Var.c()) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        h1.n.a();
                    }
                    this.f14902a = cVar;
                    this.f14903b = aVar;
                    this.f14904c = 1;
                    obj = aVar.a(this);
                    cVar = cVar;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        pg.f0 f0Var = pg.f0.f21461a;
                        cVar.cancel(null);
                        return pg.f0.f21461a;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th2);
                }
                cVar.cancel(cancellationException);
                throw th3;
            }
        }
    }
}
