package l9;

import com.basitce.htmltoapk.MainActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class f implements androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cc.b f16793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f16795c;

    public f(cc.b bVar, MainActivity mainActivity, c cVar) {
        this.f16793a = bVar;
        this.f16794b = mainActivity;
        this.f16795c = cVar;
    }

    @Override // androidx.lifecycle.e
    public final void M(androidx.lifecycle.t tVar) {
        this.f16793a.d(this.f16795c);
    }

    @Override // androidx.lifecycle.e
    public final void h(androidx.lifecycle.t tVar) {
        cc.b bVar = this.f16793a;
        Task<cc.a> taskB = bVar.b();
        final d dVar = new d(this.f16794b, bVar);
        taskB.addOnSuccessListener(new OnSuccessListener() { // from class: l9.e
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                dVar.invoke(obj);
            }
        });
    }
}
