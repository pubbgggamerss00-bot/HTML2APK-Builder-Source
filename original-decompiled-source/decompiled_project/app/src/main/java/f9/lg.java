package f9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class lg implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10007b;

    public /* synthetic */ lg(Object obj, int i10) {
        this.f10006a = i10;
        this.f10007b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        String message;
        int i10 = this.f10006a;
        Object obj2 = this.f10007b;
        switch (i10) {
            case 0:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, "folder", ((File) obj2).getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -3585, -1, 15, null);
            default:
                Context context = (Context) obj2;
                Object obj3 = ((pg.p) obj).f21471a;
                Throwable thA = pg.p.a(obj3);
                if (thA == null) {
                    message = context.getString(R.string.keystore_persisted);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                } else {
                    message = thA.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.keystore_operation_failed);
                        kotlin.jvm.internal.r.d(message, "getString(...)");
                    }
                }
                Toast.makeText(context, message, 0).show();
                return pg.f0.f21461a;
        }
    }
}
