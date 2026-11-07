package rd;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes2.dex */
public final class r implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f23421a;

    public r(s sVar) {
        this.f23421a = sVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof id.k) {
            sa.a aVar = p.f23413e;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            p pVar = this.f23421a.f23427b;
            int i10 = (int) pVar.f23415b;
            pVar.f23415b = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * pVar.f23415b : i10 != 960 ? 30L : 960L;
            pVar.f23414a = (pVar.f23415b * 1000) + System.currentTimeMillis();
            aVar.e(m0.r.a("Scheduling refresh for ", pVar.f23414a), new Object[0]);
            pVar.f23416c.postDelayed(pVar.f23417d, pVar.f23415b * 1000);
        }
    }
}
