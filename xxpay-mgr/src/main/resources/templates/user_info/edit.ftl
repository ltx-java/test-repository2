<div style="margin: 15px;">
	<form class="layui-form">
		<#if (item.id!"") != "">
		<div class="layui-form-item">
			<label class="layui-form-label">用户ID</label>
			<div class="layui-input-block">
				<input type="text" name="id" placeholder="请输入用户ID" autocomplete="off" class="layui-input"  readonly="readonly" value="${item.id?if_exists }">
			</div>
		</div>
		</#if>
		<div class="layui-form-item">
			<label class="layui-form-label">用户名称</label>
			<div class="layui-input-block">
				<input type="text" name="name" lay-verify="required" placeholder="请输入用户名称" autocomplete="off" class="layui-input" value="${item.name?if_exists }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">年龄</label>
			<div class="layui-input-block">
				<input type="text" name="age" lay-verify="required" placeholder="请输入用户年龄" autocomplete="off" class="layui-input" value="${item.age?if_exists }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">地址</label>
			<div class="layui-input-block">
				<input type="text" name="address" lay-verify="required" placeholder="请输入用户地址" autocomplete="off" class="layui-input" value="${item.address?if_exists }">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>