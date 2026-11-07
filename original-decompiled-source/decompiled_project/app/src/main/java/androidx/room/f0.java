package androidx.room;

import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.util.RunnablesProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements RunnablesExecutor {
    public static String b(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    @Override // com.android.apksig.util.RunnablesExecutor
    public void execute(RunnablesProvider runnablesProvider) {
        RunnablesExecutor.lambda$static$0(runnablesProvider);
    }
}
