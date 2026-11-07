package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<ProjectEntity> f32924a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32925b;

    public m0() {
        this(0);
    }

    public final List<ProjectEntity> a() {
        return this.f32924a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.r.a(this.f32924a, m0Var.f32924a) && this.f32925b == m0Var.f32925b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32925b) + (this.f32924a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeProjectsState(projects=" + this.f32924a + ", isLoading=" + this.f32925b + ")";
    }

    public m0(List<ProjectEntity> list, boolean z10) {
        this.f32924a = list;
        this.f32925b = z10;
    }

    public /* synthetic */ m0(int i10) {
        this(qg.z.f22752a, true);
    }
}
