package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9239b;

    public /* synthetic */ c8(Object obj, int i10) {
        this.f9238a = i10;
        this.f9239b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9238a) {
            case 0:
                eh.l lVar = (eh.l) this.f9239b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                StringBuilder sb = new StringBuilder();
                int length = it.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = it.charAt(i10);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                lVar.invoke(sb.toString());
                return pg.f0.f21461a;
            case 1:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, null, (String) this.f9239b, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null);
            default:
                ((x0.l1) this.f9239b).f(((Integer) obj).intValue());
                return pg.f0.f21461a;
        }
    }
}
