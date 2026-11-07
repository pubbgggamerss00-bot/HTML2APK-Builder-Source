package a4;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f23b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends FloatingActionButton.a {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            int i6 = BottomAppBar.f12036x0;
        }
    }

    public b(BottomAppBar bottomAppBar, int i6) {
        this.f23b = bottomAppBar;
        this.f22a = i6;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f23b.A(this.f22a));
        floatingActionButton.j(new a(), true);
    }
}
