package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.credentials.playservices.k;
import com.google.protobuf.DescriptorProtos;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements l6.b<a> {

    public static class a {
    }

    @Override // l6.b
    public final List<Class<? extends l6.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // l6.b
    public final a b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: t5.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
                int iNextInt = new Random().nextInt(Math.max(DescriptorProtos.Edition.EDITION_2023_VALUE, 1));
                final Context context2 = applicationContext;
                handlerCreateAsync.postDelayed(new Runnable() { // from class: t5.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new k(context2, 2));
                    }
                }, iNextInt + 5000);
            }
        });
        return new a();
    }
}
