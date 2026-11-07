package ga;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface k {
    @Deprecated
    Task<c> beginSignIn(b bVar);

    @Deprecated
    l getSignInCredentialFromIntent(Intent intent) throws com.google.android.gms.common.api.b;

    @Deprecated
    Task<PendingIntent> getSignInIntent(f fVar);

    @Deprecated
    Task<Void> signOut();
}
