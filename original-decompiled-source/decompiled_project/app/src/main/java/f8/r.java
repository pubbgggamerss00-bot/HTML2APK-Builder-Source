package f8;

import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import l9.v;
import l9.z;
import pg.f0;
import qg.x;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8927b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f8926a = i10;
        this.f8927b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f8926a) {
            case 0:
                v vVar = ((MainActivity) this.f8927b).jankMonitor;
                boolean zW = x.w(MainActivity.jankExemptRoutes, (String) obj);
                if (vVar.f16905h != zW) {
                    z zVar = vVar.f16900c;
                    zVar.f16916a = 0;
                    zVar.f16917b = 0;
                    zVar.f16918c = 0;
                }
                vVar.f16905h = zW;
                return f0.f21461a;
            default:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, null, ((File) this.f8927b).getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null);
        }
    }
}
