<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">代理商ID</label>
			<div class="layui-input-block">
				<input type="text" class="layui-input" disabled="disabled" value="${item.agentId?if_exists }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">代理商名称</label>
			<div class="layui-input-block">
				<input type="text" disabled="disabled" class="layui-input" value="${item.agentName?if_exists }">
			</div>
		</div>



        <div class="layui-form-item">
            <label class="layui-form-label">创建时间</label>
            <div class="layui-input-block">
                <input type="text" disabled="disabled" class="layui-input" value="${(item.createTime?string("yyyy-MM-dd HH:mm:ss"))!''} ">
            </div>
        </div>

		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>