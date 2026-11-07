package q2;

import c0.g0;
import java.util.List;
import kotlin.jvm.internal.h0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kh.i<Object>[] f21754a;

    static {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        h0.f16332a.getClass();
        f21754a = new kh.i[]{vVar, new kotlin.jvm.internal.v("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new kotlin.jvm.internal.v("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.v("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.v("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v(CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new kotlin.jvm.internal.v("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new kotlin.jvm.internal.v("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new kotlin.jvm.internal.v("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.v("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.v("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.v("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.v("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.v("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v("inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.v("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.v("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new kotlin.jvm.internal.v("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.v("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new kotlin.jvm.internal.v("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new kotlin.jvm.internal.v("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new kotlin.jvm.internal.v("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.v("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.v("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        c0<List<String>> c0Var = w.f21820a;
        c0<a<eh.l<List<t2.h0>, Boolean>>> c0Var2 = k.f21773a;
    }

    public static final <T> c0<T> a(String str) {
        c0<T> c0Var = new c0<>(str);
        c0Var.f21760c = true;
        return c0Var;
    }

    public static final <T> c0<T> b(String str, eh.p<? super T, ? super T, ? extends T> pVar) {
        return new c0<>(str, true, pVar);
    }

    public static void c(d0 d0Var, eh.l lVar) {
        d0Var.c(k.f21773a, new a(null, lVar));
    }

    public static final void d(d0 d0Var, String str) {
        c0<List<String>> c0Var = w.f21820a;
        d0Var.c(w.f21820a, g0.c(str));
    }

    public static final void e(d0 d0Var, int i10) {
        c0<i> c0Var = w.f21842w;
        kh.i<Object> iVar = f21754a[12];
        i iVar2 = new i(i10);
        c0Var.getClass();
        d0Var.c(c0Var, iVar2);
    }

    public static final void f(d0 d0Var) {
        c0<Boolean> c0Var = w.f21832m;
        kh.i<Object> iVar = f21754a[6];
        Boolean bool = Boolean.TRUE;
        c0Var.getClass();
        d0Var.c(c0Var, bool);
    }
}
