package t6;

import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f28013a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkSpec f28014b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f28015c;

    public e0(UUID id2, WorkSpec workSpec, Set<String> tags) {
        kotlin.jvm.internal.r.e(id2, "id");
        kotlin.jvm.internal.r.e(workSpec, "workSpec");
        kotlin.jvm.internal.r.e(tags, "tags");
        this.f28013a = id2;
        this.f28014b = workSpec;
        this.f28015c = tags;
    }
}
