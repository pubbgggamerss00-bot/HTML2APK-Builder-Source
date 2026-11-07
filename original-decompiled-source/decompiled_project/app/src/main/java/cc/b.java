package cc;

import android.content.IntentSender;
import com.basitce.htmltoapk.MainActivity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface b {
    Task<Void> a();

    Task<a> b();

    void c(l9.c cVar);

    void d(l9.c cVar);

    @Deprecated
    boolean e(a aVar, MainActivity mainActivity) throws IntentSender.SendIntentException;
}
