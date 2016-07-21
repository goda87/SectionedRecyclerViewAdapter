package io.github.luizgrp.sectionedrecyclerviewadapter;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Abstract Section with no States.
 *
 * @author Gustavo Pagani
 */
public abstract class StatelessSection extends Section {

    /**
     * Create a Section object with loading/failed states but no header and footer
     * @param itemResourceId layout resource for its items
     */
    public StatelessSection(@LayoutRes int itemResourceId) {
        super(itemResourceId, null, null);
    }

    /**
     * Create a Section object with loading/failed states, a custom header but no footer
     * @param headerResourceId layout resource for its header
     * @param itemResourceId layout resource for its items
     */
    public StatelessSection(@LayoutRes int headerResourceId, @LayoutRes int itemResourceId) {
        super(headerResourceId, itemResourceId, null, null);
    }

    /**
     * Create a Section object with loading/failed states, a custom header and footer
     * @param headerResourceId layout resource for its header
     * @param footerResourceId layout resource for its footer
     * @param itemResourceId layout resource for its items
     */
    public StatelessSection(@LayoutRes int headerResourceId,
                            @LayoutRes int footerResourceId, @LayoutRes int itemResourceId) {
        super(headerResourceId, footerResourceId, itemResourceId, null, null);
    }

    @Override
    public final void onBindLoadingViewHolder(RecyclerView.ViewHolder holder) {
        super.onBindLoadingViewHolder(holder);
    }

    @Override
    public final RecyclerView.ViewHolder getLoadingViewHolder(View view) {
        return super.getLoadingViewHolder(view);
    }

    @Override
    public final void onBindFailedViewHolder(RecyclerView.ViewHolder holder) {
        super.onBindFailedViewHolder(holder);
    }

    @Override
    public final RecyclerView.ViewHolder getFailedViewHolder(View view) {
        return super.getFailedViewHolder(view);
    }
}
