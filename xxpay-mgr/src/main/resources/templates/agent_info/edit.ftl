<div style="margin: 15px;">
	<form class="layui-form">
		<#if (item.agentId!"") != "">
		<div class="layui-form-item">
			<label class="layui-form-label">代理商ID</label>
			<div class="layui-input-block">
				<input type="text" name="agentId" placeholder="请输入代理商ID" autocomplete="off" class="layui-input"  readonly="readonly" value="${item.agentId?if_exists }">
			</div>
		</div>
		</#if>
		<div class="layui-form-item">
			<label class="layui-form-label">代理商名称</label>
			<div class="layui-input-block">
				<input type="text" name="agentName" lay-verify="required" placeholder="请输入代理商名称" autocomplete="off" class="layui-input" value="${item.agentName?if_exists }">
			</div>
		</div>




		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>