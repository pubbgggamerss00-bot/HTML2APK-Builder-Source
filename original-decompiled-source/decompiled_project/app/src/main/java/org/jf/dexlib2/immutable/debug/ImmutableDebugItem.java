package org.jf.dexlib2.immutable.debug;

import nc.r;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.EpilogueBegin;
import org.jf.dexlib2.iface.debug.LineNumber;
import org.jf.dexlib2.iface.debug.PrologueEnd;
import org.jf.dexlib2.iface.debug.RestartLocal;
import org.jf.dexlib2.iface.debug.SetSourceFile;
import org.jf.dexlib2.iface.debug.StartLocal;
import org.jf.util.ExceptionWithContext;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public abstract class ImmutableDebugItem implements DebugItem {
    private static final ImmutableConverter<ImmutableDebugItem, DebugItem> CONVERTER = new ImmutableConverter<ImmutableDebugItem, DebugItem>() { // from class: org.jf.dexlib2.immutable.debug.ImmutableDebugItem.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(DebugItem debugItem) {
            return debugItem instanceof ImmutableDebugItem;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableDebugItem makeImmutable(DebugItem debugItem) {
            return ImmutableDebugItem.of(debugItem);
        }
    };
    protected final int codeAddress;

    public ImmutableDebugItem(int i10) {
        this.codeAddress = i10;
    }

    public static r<ImmutableDebugItem> immutableListOf(Iterable<? extends DebugItem> iterable) {
        return CONVERTER.toList(iterable);
    }

    public static ImmutableDebugItem of(DebugItem debugItem) {
        if (debugItem instanceof ImmutableDebugItem) {
            return (ImmutableDebugItem) debugItem;
        }
        switch (debugItem.getDebugItemType()) {
            case 3:
                return ImmutableStartLocal.of((StartLocal) debugItem);
            case 4:
            default:
                throw new ExceptionWithContext("Invalid debug item type: %d", Integer.valueOf(debugItem.getDebugItemType()));
            case 5:
                return ImmutableEndLocal.of((EndLocal) debugItem);
            case 6:
                return ImmutableRestartLocal.of((RestartLocal) debugItem);
            case 7:
                return ImmutablePrologueEnd.of((PrologueEnd) debugItem);
            case 8:
                return ImmutableEpilogueBegin.of((EpilogueBegin) debugItem);
            case 9:
                return ImmutableSetSourceFile.of((SetSourceFile) debugItem);
            case 10:
                return ImmutableLineNumber.of((LineNumber) debugItem);
        }
    }

    @Override // org.jf.dexlib2.iface.debug.DebugItem
    public int getCodeAddress() {
        return this.codeAddress;
    }
}
