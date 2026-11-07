package androidx.work;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import tg.h;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f3111a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f3112b;

    /* renamed from: c, reason: collision with root package name */
    public h f3113c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f3114a;

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f3115b;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f3114a = list;
            this.f3115b = list;
        }
    }

    public WorkerParameters() {
        throw null;
    }
}
